package OOPS.RestaurantReservationPractice;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Table> tables;
    List<Reservation> reservations;

    Restaurant() {
        this.tables = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // Add a table to the restaurant
    public void addTable(Table table) {
        tables.add(table);
        System.out.println("Table " + table.getTableNumber() + " with capacity " + table.getCapacity() + " added.");
    }

    // Check table availability
    public Table checkAvailability(int requiredCapacity) {
        for (Table table : tables) {
            if (table.isAvailable() && table.getCapacity() >= requiredCapacity) {
                return table;
            }
        }
        return null;
    }

    // Reserve a table
    public boolean reserveTable(String customerName, String reservationTime, int requiredCapacity) {
        Table availableTable = checkAvailability(requiredCapacity);
        if (availableTable != null) {
            availableTable.setAvailable(false);
            Reservation reservation = new Reservation(customerName, reservationTime, availableTable);
            reservations.add(reservation);
            System.out.println("Reservation successful! Table " + availableTable.getTableNumber() + " reserved for "
                    + customerName + " at " + reservationTime + ".");
            return true;
        } else {
            System.out.println("No available tables for the required capacity.");
            return false;
        }
    }

    // Cancel a reservation
    public boolean cancelReservation(String customerName) {
        for (Reservation reservation : reservations) {
            if (reservation.getCustomerName().equals(customerName)) {
                reservation.getTable().setAvailable(true);
                reservations.remove(reservation);
                System.out.println("Reservation for " + customerName + " has been canceled.");
                return true;
            }
        }
        System.out.println("No reservation found for " + customerName + ".");
        return false;
    }

    // List all reservations
    public void listReservations() {
        System.out.println("Current Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println("Customer: " + reservation.getCustomerName() +
                    ", Time: " + reservation.getReservationTime() +
                    ", Table: " + reservation.getTable().getTableNumber());
        }
    }
}
