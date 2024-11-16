package LLD.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private List<Slot> slots;
    private int floorNumber;

    public Floor(int floorNumber) {
        this.slots = new ArrayList<>();
        this.floorNumber = floorNumber;
    }

    public void addSlot(Slot slot) {
        slots.add(slot);
        System.out.println("Slot added successfully for floor: " + floorNumber + " with vehicle type: "
                + slot.getVehicle().getType());
    }

    public Slot findAvailableSlot() throws NoAvailableSlotException {
        for (Slot slot : slots) {
            if (!slot.isOccupied()) {
                return slot;
            }
        }
        throw new NoAvailableSlotException("No available slots found on floor " + floorNumber);
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
