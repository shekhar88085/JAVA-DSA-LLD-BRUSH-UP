package LLD.VendingMachine;

import java.util.Map;

public class StockManager {
    public void restock(Map<Product, Integer> products, Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }
}