package LLD.ParkingLot;

public class Slot {
    int slotId;
    boolean isOccupied;
    SlotType slotType;
    Vehicle vehicle;

    public Slot(int slotId, boolean isOccupied, SlotType slotType, Vehicle vehicle) {
        this.slotId = slotId;
        this.isOccupied = isOccupied;
        this.slotType = slotType;
        this.vehicle = vehicle;
    }

    public int getSlotId() {
        return slotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
