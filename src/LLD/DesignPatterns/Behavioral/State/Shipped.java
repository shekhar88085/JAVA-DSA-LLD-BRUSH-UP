package LLD.DesignPatterns.Behavioral.State;

public class Shipped implements State {

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered.");
        order.setState(new Delivered());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Shipped order cannot be cancelled.");
    }
}