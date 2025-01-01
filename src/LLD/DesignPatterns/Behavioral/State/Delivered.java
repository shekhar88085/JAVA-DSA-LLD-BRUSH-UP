package LLD.DesignPatterns.Behavioral.State;

public class Delivered implements State {

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Delivered order cannot be cancelled.");
    }
}