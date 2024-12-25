package LLD.BookingSystem;

import LLD.BookingSystem.enums.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create some sample data
        Movie movie1 = new Movie(1, "Inception", Genre.ACTION, Industry.HOLLYWOOD,
                new Date(), Arrays.asList("Leonardo DiCaprio", "Elliot Page"),
                8.8, Language.ENGLISH);
        Movie movie2 = new Movie(2, "3 Idiots", Genre.COMEDY, Industry.BOLLYWOOD,
                new Date(), Arrays.asList("Aamir Khan", "Kareena Kapoor"),
                9.0, Language.HINDI);

        Show show1 = new Show(1, new Date(), new Date(System.currentTimeMillis() + 2 * 60 * 60 * 1000),
                movie1.getId(), 101, ShowType.IMAX, 50);
        Show show2 = new Show(2, new Date(), new Date(System.currentTimeMillis() + 3 * 60 * 60 * 1000),
                movie2.getId(), 102, ShowType.NORMAL, 100);

        Theater theater = new Theater(1, "PVR Cinemas", "Mumbai", 5, 200);
        theater.addShowWithMovie(Arrays.asList(show1, show2));

        // Display list of shows
        System.out.println("Available Shows:");
        theater.getListOfShows();

        // Booking Flow
        Booking booking = new Booking(1, 101, Arrays.asList("A1", "A2"), 2, movie1.getId(),
                show1.getId(), 500.0, new Date(), Status.PENDING);

        System.out.println("\nProcessing Booking:");
        System.out.println("Seats Selected: " + booking.getSeatsSelected());
        System.out.println("Booking Status: " + booking.getStatus());

        // Payment Flow
        Payment payment = new Payment(1, booking.getId(), booking.getBookingAmount(),
                new Date(), PaymentStatus.PENDING, PaymentMethod.UPI);

        payment.processPayment();

        if (payment.getStatus() == PaymentStatus.SUCCESS) {
            booking.setStatus(Status.CONFIRMED);
            System.out.println("Booking Confirmed!");
        } else {
            booking.setStatus(Status.CANCELLED);
            System.out.println("Booking Failed!");
        }

        // Display Booking Details
        System.out.println("\nFinal Booking Details:");
        System.out.println("Booking ID: " + booking.getId());
        System.out.println("Booking seat selected: " + booking.getSeatsSelected());
        System.out.println("Booking Status: " + booking.getStatus());
        System.out.println("Payment Status: " + payment.getStatus());
    }
}