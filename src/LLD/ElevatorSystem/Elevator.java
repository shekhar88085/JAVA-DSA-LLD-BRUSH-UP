package LLD.ElevatorSystem;

public class Elevator {
    private int id;
    private int currentFloorNumber;
    private int currentWeight;
    private int currentPersonCount;
    private ButtonPanel buttonPanel;
    private static final int MAX_WEIGHT = 600; // Max weight limit for the elevator
    private static final int MAX_PERSON_COUNT = 8; // Max person limit for the elevator
    private boolean doorOpen = false;

    public Elevator(int id, int currentFloorNumber, ButtonPanel buttonPanel) {
        this.id = id;
        this.currentFloorNumber = currentFloorNumber;
        this.buttonPanel = buttonPanel;
    }

    // Check if elevator is overloaded or not
    public boolean checkOverWeight() {
        if (currentWeight >= MAX_WEIGHT || currentPersonCount >= MAX_PERSON_COUNT) {
            beepAndStop();
            return false;
        }
        return true;
    }

    private void beepAndStop() {
        System.out.println("Beep! Overweight detected. Elevator cannot move.");
    }

    // Move the elevator to the requested floor
    public void moveToFloor(int requestedFloor, Direction direction) {
        if (currentFloorNumber != requestedFloor && checkOverWeight()) {
            System.out.println("Elevator moving from floor " + currentFloorNumber + " to floor " + requestedFloor);
            currentFloorNumber = requestedFloor;
            openDoor(); // Open door after reaching the floor
        }
    }

    // Open the door of the elevator
    public void openDoor() {
        doorOpen = true;
        System.out.println("Elevator doors are now open at floor " + currentFloorNumber);
    }

    // Close the door of the elevator
    public void closeDoor() {
        doorOpen = false;
        System.out.println("Elevator doors are now closed at floor " + currentFloorNumber);
    }

    // Getter for current floor number
    public int getCurrentFloorNumber() {
        return currentFloorNumber;
    }
}