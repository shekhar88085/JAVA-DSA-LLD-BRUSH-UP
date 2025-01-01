package LLD.DesignPatterns.Behavioral.Iterator;

public class OrderIterator implements Iterator {
    private OrderCollection orders;
    private int currentIndex = 0;

    public OrderIterator(OrderCollection orders) {
        this.orders = orders;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < orders.getOrders().size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return orders.getOrders().get(currentIndex++);
        }
        return null;
    }
}
