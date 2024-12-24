package LLD.ParkingLot;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    List<Floor> floors;
    Map<VehicleType, Double> parkingRates;

    public ParkingLot(List<Floor> floors, Map<VehicleType, Double> parkingRates) {
        this.floors = floors;
        this.parkingRates = parkingRates;
    }

    Ticket parkVehicle(Vehicle vehicle) throws NoAvailableSlotException {
        Slot availableSlot = null;
        int floorNumber = 0;

        // Search for an available slot in all floors
        for (Floor floor : floors) {
            try {
                availableSlot = floor.findAvailableSlot(); // Find an available slot
                availableSlot.setOccupied(true);
                floor.addSlot(availableSlot);
                floorNumber = floor.getFloorNumber();
                break;
            } catch (NoAvailableSlotException e) {
                // Continue to the next floor
            }
        }

        if (availableSlot == null) {
            throw new NoAvailableSlotException("No available slots for the vehicle type: " + vehicle.getType());
        }

        // Mark the slot as occupied
        //availableSlot.setOccupied(true);

        // Generate a unique ticket ID
        String ticketId = "T-" + System.currentTimeMillis();

        System.out.println("Vehicle " + vehicle.getType() + " parked successfully at floor " + floorNumber + " with ticketId " + ticketId + " at slot " + availableSlot.slotId);

        // Create and return the parking ticket
        return new Ticket(ticketId, vehicle, availableSlot);
    }

    boolean unparkVehicle(Ticket ticket) {
        for (Floor floor : floors) {
            for (Slot slot : floor.getSlots()) {
                if (slot.equals(ticket.slot)) {
                    slot.setOccupied(false); // Mark the slot as unoccupied
                    System.out.println("Vehicle unparked successfully from slot: " + slot.getSlotId());
                    return true; // Successfully unparked
                }
            }
        }
        System.out.println("No matching slot found for the ticket: " + ticket.ticketId);
        return false; // No matching slot found
    }
}