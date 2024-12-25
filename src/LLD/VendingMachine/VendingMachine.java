package LLD.VendingMachine;

import java.util.Map;

public class VendingMachine {
    private Map<Product, Integer> products;  // Product to quantity map
    private StockManager stockManager;
    private ChangeMaker changeManager;

    public VendingMachine(Map<Product, Integer> products) {
        this.products = products;
        this.stockManager = new StockManager();
        this.changeManager = new ChangeMaker();
    }

    public boolean selectProduct(Product product) {
        // Check if product is available
        return products.getOrDefault(product, 0) > 0;
    }

    public boolean makePayment(Payment payment, Product product) {
        double amountPaid = payment.getAmount();
        if (amountPaid < product.getPrice()) {
            System.out.println("Insufficient funds!");
            return false;
        }
        double change = amountPaid - product.getPrice();
        changeManager.calculateChange(change);
        return true;
    }

    public void dispenseProduct(Product product) {
        // Dispense the product and update quantity
        if (products.get(product) > 0) {
            products.put(product, products.get(product) - 1);
            System.out.println("Dispensing: " + product.getName());
        } else {
            System.out.println("Product out of stock!");
        }
    }

    public void restockProduct(Product product, int quantity) {
        stockManager.restock(products, product, quantity);
    }

    public void handleTransaction(Product product, Payment payment) {
        if (selectProduct(product) && makePayment(payment, product)) {
            dispenseProduct(product);
        } else {
            System.out.println("Transaction failed!");
        }
    }
}