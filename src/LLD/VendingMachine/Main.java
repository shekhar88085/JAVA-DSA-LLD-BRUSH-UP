package LLD.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize the Vending Machine with some products
        Product soda = new Product("Soda", 1.50, 10);
        Product chips = new Product("Chips", 2.00, 5);
        Product candy = new Product("Candy", 1.00, 20);

        Map<Product, Integer> initialStock = new HashMap<>();
        initialStock.put(soda, soda.getQuantity());
        initialStock.put(chips, chips.getQuantity());
        initialStock.put(candy, candy.getQuantity());

        VendingMachine vendingMachine = new VendingMachine(initialStock);

        // Step 2: User selects a product
        System.out.println("User selects Soda.");
        if (vendingMachine.selectProduct(soda)) {
            System.out.println("Soda is available.");
        } else {
            System.out.println("Soda is out of stock.");
        }

        // Step 3: User makes a payment
        System.out.println("User pays $2.00 for Soda.");
        Payment payment = new Payment(2.00);
        if (vendingMachine.makePayment(payment, soda)) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed.");
        }

        // Step 4: Dispense the product
        vendingMachine.dispenseProduct(soda);

        // Step 5: Restocking a product
        System.out.println("Restocking Chips with 5 units.");
        vendingMachine.restockProduct(chips, 5);

        // Step 6: Handle another transaction
        System.out.println("User selects Candy and pays $1.50.");
        Payment candyPayment = new Payment(1.50);
        vendingMachine.handleTransaction(candy, candyPayment);

        // Step 7: Attempt to buy out-of-stock product
        System.out.println("Trying to buy Soda repeatedly...");
        for (int i = 0; i < 12; i++) {
            vendingMachine.handleTransaction(soda, new Payment(1.50));
        }
    }
}
