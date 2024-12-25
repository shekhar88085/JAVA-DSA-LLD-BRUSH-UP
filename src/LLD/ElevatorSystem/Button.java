package LLD.ElevatorSystem;

public class Button {
    private int floorNumber; // For floor buttons, it could represent the floor number
    private ButtonType buttonType; // e.g., FLOOR, OPEN_DOOR, CLOSE_DOOR

    public Button(int floorNumber, ButtonType buttonType) {
        this.floorNumber = floorNumber;
        this.buttonType = buttonType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ButtonType getButtonType() {
        return buttonType;
    }
}