package OOPS.RestaurantReservationPractice;

public class Table {
    private int tableNumber;
    private int capacity;
    private boolean isAvailable;

    Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    boolean isAvailable() {
        return isAvailable;
    }

    void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
