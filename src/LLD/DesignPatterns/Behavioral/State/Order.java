package LLD.DesignPatterns.Behavioral.State;

public class Order {
    private State state;

    public Order() {
        this.state = new OrderPlaced();  // Initial state is "Order Placed"
    }

    public void setState(State state) {
        this.state = state;
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}