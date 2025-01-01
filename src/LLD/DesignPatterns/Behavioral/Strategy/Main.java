package LLD.DesignPatterns.Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        // Create a PaymentContext with CreditCardPayment strategy
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.processPayment(100.0);

        // Change the strategy to PayPalPayment at runtime
        context.setPaymentStrategy(new PayPalPayment());
        context.processPayment(200.0);

        // Change the strategy to BankTransferPayment at runtime
        context.setPaymentStrategy(new UPIPayment());
        context.processPayment(300.0);
    }
}