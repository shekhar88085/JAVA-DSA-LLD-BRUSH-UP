package LLD.DesignPatterns.Behavioral.State;

public class OrderPlaced implements State {

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped.");
        order.setState(new Shipped());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered directly. It must be shipped first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new Cancelled());
    }
}