package LLD.DesignPatterns.Behavioral.State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.shipOrder();  // Order is shipped
        order.deliverOrder();  // Order is delivered
        order.cancelOrder();  // Cannot cancel delivered order

        Order order2 = new Order();
        order2.shipOrder();  // Order is shipped
        order2.cancelOrder();  // Cannot cancel shipped order
    }
}