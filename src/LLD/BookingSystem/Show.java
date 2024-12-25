package LLD.BookingSystem;

import java.util.Date;

import LLD.BookingSystem.enums.ShowType;

public class Show {
    private int id;
    private Date showTime;
    private Date endTime;
    private int movieId;
    private int screenId;
    private ShowType showType;
    private int availableSeats;

    // Constructor
    public Show(int id, Date showTime, Date endTime, int movieId, int screenId, ShowType showType, int availableSeats) {
        this.id = id;
        this.showTime = showTime;
        this.endTime = endTime;
        this.movieId = movieId;
        this.screenId = screenId;
        this.showType = showType;
        this.availableSeats = availableSeats;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Date getShowTime() {
        return showTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getScreenId() {
        return screenId;
    }

    public ShowType getShowType() {
        return showType;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Methods
    // To be used when a booking is made
    public boolean bookSeats(int seatsToBook) {
        if (seatsToBook <= availableSeats) {
            availableSeats -= seatsToBook;
            return true; // Successful booking
        }
        return false; // Not enough available seats
    }

    // Display details of the show (movieId, showTime, showType, etc.)
    public void getDetails() {
        System.out.println("Show ID: " + id);
        System.out.println("Movie ID: " + movieId);
        System.out.println("Screen ID: " + screenId);
        System.out.println("Show Time: " + showTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Show Type: " + showType);
        System.out.println("Available Seats: " + availableSeats);
    }

    // Method to simulate seat display (Could return a seat map or availability)
    public void getSeats() {
        System.out.println("Displaying seats for Show ID: " + id);
        // Assuming a simple representation of available seats
        // In a real system, you'd have a seat map with a row/column layout.
        System.out.println("Available seats: " + availableSeats);
    }
}