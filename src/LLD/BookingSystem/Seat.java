package LLD.BookingSystem;

import LLD.BookingSystem.enums.SeatType;

public class Seat {
    private int id; // Unique identifier for the seat
    private SeatType seatType; // Type of the seat (e.g., Premium, Regular)
    private boolean isAvailable; // Availability of the seat (true = available, false = booked)
    private String location; // Location in the theater (e.g., A1, B3, etc.)

    // Constructor
    public Seat(int id, SeatType seatType, String location) {
        this.id = id;
        this.seatType = seatType;
        this.isAvailable = true; // Seats are available by default when created
        this.location = location;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to book a seat
    public boolean bookSeat() {
        if (isAvailable) {
            isAvailable = false; // Mark the seat as booked
            return true; // Booking successful
        }
        return false; // Seat already booked
    }

    // Method to cancel a booking and make the seat available again
    public void cancelSeat() {
        isAvailable = true; // Make the seat available again
    }

    @Override
    public String toString() {
        return "Seat ID: " + id + ", Type: " + seatType + ", Location: " + location + ", Available: " + isAvailable;
    }
}