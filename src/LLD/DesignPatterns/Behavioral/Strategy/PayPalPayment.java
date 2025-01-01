package LLD.DesignPatterns.Behavioral.Strategy;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}