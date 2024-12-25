package LLD.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorControlSystem {
    private List<Elevator> elevators;
    private List<Floor> floors;

    public ElevatorControlSystem(List<Elevator> elevators, List<Floor> floors) {
        this.elevators = elevators;
        this.floors = floors;
    }

    // Assigns the closest elevator to the requested floor
    public void assignElevatorToFloor(int requestedFloor, Direction direction) {
        Elevator selectedElevator = null;
        int minDistance = Integer.MAX_VALUE;

        // Loop through all elevators to find the nearest one
        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloorNumber() - requestedFloor);
            if (distance < minDistance && elevator.checkOverWeight()) {
                minDistance = distance;
                selectedElevator = elevator;
            }
        }

        if (selectedElevator != null) {
            selectedElevator.moveToFloor(requestedFloor, direction);
        } else {
            System.out.println("No available elevator at the moment.");
        }
    }

    // Request elevator to open door once it reaches the floor
    public void openElevatorDoor(Elevator elevator) {
        elevator.openDoor();
    }

    // Request elevator to close door
    public void closeElevatorDoor(Elevator elevator) {
        elevator.closeDoor();
    }
}