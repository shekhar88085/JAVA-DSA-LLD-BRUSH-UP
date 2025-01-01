package LLD.DesignPatterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class OrderCollection implements Aggregate {
    private List<Order> orders;

    public OrderCollection() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public Iterator createIterator() {
        return new OrderIterator(this);
    }
}
