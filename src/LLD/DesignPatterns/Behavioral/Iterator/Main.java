package LLD.DesignPatterns.Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create an OrderCollection and add orders
        OrderCollection orderCollection = new OrderCollection();
        orderCollection.addOrder(new Order(1, "Alice", 100.5));
        orderCollection.addOrder(new Order(2, "Bob", 150.75));
        orderCollection.addOrder(new Order(3, "Charlie", 200.0));

        // Get the iterator from the OrderCollection
        Iterator orderIterator = orderCollection.createIterator();

        // Iterate through orders
        while (orderIterator.hasNext()) {
            Order order = (Order) orderIterator.next();
            System.out.println(order);
        }
    }
}
