package LLD.DesignPatterns.Behavioral.State;

public interface State {
    void shipOrder(Order order);
    void deliverOrder(Order order);
    void cancelOrder(Order order);
}
