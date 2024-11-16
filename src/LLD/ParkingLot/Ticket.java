package LLD.ParkingLot;

import java.time.LocalDateTime;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    Slot slot;
    LocalDateTime issueTime;
    LocalDateTime paymentTime;

    public Ticket(String ticketId, Vehicle vehicle, Slot slot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slot = slot;
        this.issueTime = LocalDateTime.now(); // Set issue time to the current time
    }

    public void setPaymentTime() {
        this.paymentTime = LocalDateTime.now(); // Record the payment time
    }
}