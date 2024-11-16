package LLD.ParkingLot;

public class NoAvailableSlotException extends Exception {
    public NoAvailableSlotException(String message) {
        super(message);
    }
}