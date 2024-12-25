package LLD.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Elevator and Floor objects
        Elevator elevator1 = new Elevator(1, 0, new ButtonPanel());
        Elevator elevator2 = new Elevator(2, 5, new ButtonPanel());

        List<Elevator> elevators = new ArrayList<>();
        elevators.add(elevator1);
        elevators.add(elevator2);

        Floor floor1 = new Floor(1, 1, new ButtonPanel());
        Floor floor2 = new Floor(2, 2, new ButtonPanel());

        List<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        floors.add(floor2);

        // Create Elevator Control System
        ElevatorControlSystem elevatorControlSystem = new ElevatorControlSystem(elevators, floors);

        // Floor 1 calls elevator to go up
        floor1.callElevator(Direction.UP);

        // System assigns elevator and moves it
        elevatorControlSystem.assignElevatorToFloor(1, Direction.UP);

        // Elevator arrives, open door
        elevatorControlSystem.openElevatorDoor(elevator1);

        // Simulate closing the door after passenger enters
        elevatorControlSystem.closeElevatorDoor(elevator1);
    }
}
