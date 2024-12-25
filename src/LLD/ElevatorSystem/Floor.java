package LLD.ElevatorSystem;

public class Floor {
    private int id;
    private int floorNumber;
    private ButtonPanel buttonPanel;

    public Floor(int id, int floorNumber, ButtonPanel buttonPanel) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.buttonPanel = buttonPanel;
    }

    // Request the elevator to come to this floor
    public void callElevator(Direction direction) {
        buttonPanel.pressButton(direction);
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}