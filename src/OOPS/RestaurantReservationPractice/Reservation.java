package OOPS.RestaurantReservationPractice;

public class Reservation {
    private String customerName;
    private String reservationTime;
    private Table table;

    Reservation(String customerName, String reservationTime, Table table) {
        this.customerName = customerName;
        this.reservationTime = reservationTime;
        this.table = table;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public Table getTable() {
        return table;
    }
}
