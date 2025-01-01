package LLD.DesignPatterns.Behavioral.Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Constructor to set the payment strategy
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Set a new payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Delegate the payment processing to the current strategy
    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}