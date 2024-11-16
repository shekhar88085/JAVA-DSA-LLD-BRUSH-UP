package LLD.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initializing parking rates
        Map<VehicleType, Double> parkingRates = new HashMap<>();
        parkingRates.put(VehicleType.BIKE, 10.0);
        parkingRates.put(VehicleType.CAR, 25.0);
        parkingRates.put(VehicleType.TRUCK, 50.0);

        // Initializing floors
        List<Floor> floors = new ArrayList<>();
        Floor floor1 = new Floor(0);
        Floor floor2 = new Floor(1);
        Floor floor3 = new Floor(3);
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);

        // Creating a ParkingLot object
        ParkingLot parkingLot = new ParkingLot(floors, parkingRates);

        System.out.println("Parking Lot initialized with " + floors.size() + " floors.");

        Vehicle bike = new Vehicle("UP780476", VehicleType.BIKE);

        //add slot to floor
        Slot slot = new Slot(0, false, SlotType.BIKE, bike);
        floor1.addSlot(slot);
        try {
            parkingLot.parkVehicle(bike);
        } catch (NoAvailableSlotException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
