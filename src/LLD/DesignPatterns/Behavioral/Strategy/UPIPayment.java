package LLD.DesignPatterns.Behavioral.Strategy;

public class UPIPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI transfer payment of $" + amount);
    }
}
