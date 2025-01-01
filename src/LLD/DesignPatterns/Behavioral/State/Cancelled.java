package LLD.DesignPatterns.Behavioral.State;

public class Cancelled implements State {

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cancelled order cannot be shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cancelled order cannot be delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order already cancelled.");
    }
}