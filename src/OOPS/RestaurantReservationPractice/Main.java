package OOPS.RestaurantReservationPractice;

public class Main {
    public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant();

        // Add tables to the restaurant
        restaurant.addTable(new Table(1, 4));
        restaurant.addTable(new Table(2, 6));
        restaurant.addTable(new Table(3, 2));

        // Make reservations
        restaurant.reserveTable("Ella", "7:00 PM", 4); // Should succeed
        restaurant.reserveTable("Elly", "7:30 PM", 2); // Should succeed
        restaurant.reserveTable("John", "8:00 PM", 6); // Should succeed
        restaurant.reserveTable("Chris", "8:30 PM", 8); // Should fail (no table for capacity 8)

        // List reservations
        restaurant.listReservations();

        // Cancel a reservation
        restaurant.cancelReservation("Elly"); // Should succeed
        restaurant.cancelReservation("Chris"); // Should fail (no such reservation)

        // List reservations again
        restaurant.listReservations();
    }
}
