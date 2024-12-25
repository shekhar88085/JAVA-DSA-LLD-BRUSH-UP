package LLD.BookingSystem;

import java.util.Date;
import java.util.List;

import LLD.BookingSystem.enums.Status;

public class Booking {
    private int id; // Unique identifier for the booking
    private int userId; // ID of the user who made the booking
    private List<String> seatsSelected; // List of seat locations selected (e.g., A1, B1)
    private int numberOfSeats; // Total number of seats booked
    private int movieId; // ID of the movie booked
    private int showId; // ID of the show booked
    private Double bookingAmount; // Total amount for the booking
    private Date bookingDate; // Date when the booking was made
    private Status status; // Status of the booking (CONFIRMED, PENDING, CANCELLED)

    // Constructor
    public Booking(int id, int userId, List<String> seatsSelected, int numberOfSeats, int movieId, int showId,
            Double bookingAmount, Date bookingDate, Status status) {
        this.id = id;
        this.userId = userId;
        this.seatsSelected = seatsSelected;
        this.numberOfSeats = numberOfSeats;
        this.movieId = movieId;
        this.showId = showId;
        this.bookingAmount = bookingAmount;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getSeatsSelected() {
        return seatsSelected;
    }

    public void setSeatsSelected(List<String> seatsSelected) {
        this.seatsSelected = seatsSelected;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Methods
    public String getBookingDetails() {
        return "Booking ID: " + id +
                ", User ID: " + userId +
                ", Movie ID: " + movieId +
                ", Show ID: " + showId +
                ", Seats: " + seatsSelected +
                ", Booking Amount: " + bookingAmount +
                ", Date: " + bookingDate +
                ", Status: " + status;
    }

    public void updateBookingStatus(Status status) {
        this.status = status;
    }

    public boolean validateSeats() {
        return seatsSelected.size() == numberOfSeats;
    }

    public void calculateBookingAmount(Double seatPrice) {
        this.bookingAmount = seatPrice * numberOfSeats;
    }
}