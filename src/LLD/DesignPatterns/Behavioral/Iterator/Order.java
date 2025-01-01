package LLD.DesignPatterns.Behavioral.Iterator;

public class Order {
    private int orderId;
    private String customerName;
    private double amount;

    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
