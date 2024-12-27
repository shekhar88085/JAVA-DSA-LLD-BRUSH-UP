package LLD.CoffeeMachine;

import java.util.Map;

public class Inventory {
    private Map<String, Double> ingredients; // Ingredient name -> quantity in stock

    // Constructor
    public Inventory(Map<String, Double> ingredients) {
        this.ingredients = ingredients;
    }

    // Check if ingredient is available
    public boolean isIngredientAvailable(String ingredient, double quantityRequired) {
        return ingredients.getOrDefault(ingredient, 0.0) >= quantityRequired;
    }

    // Method to update the stock after brewing a beverage
    public void updateStock(Map<String, Double> usedIngredients) {
        for (Map.Entry<String, Double> entry : usedIngredients.entrySet()) {
            String ingredient = entry.getKey();
            Double quantityUsed = entry.getValue();

            // Check if enough stock is available before deducting
            if (isIngredientAvailable(ingredient, quantityUsed)) {
                double currentStock = ingredients.get(ingredient);
                ingredients.put(ingredient, currentStock - quantityUsed);
            } else {
                System.out.println("Not enough stock for " + ingredient);
            }
        }
    }

    // Method to check stock of a specific ingredient
    public double getStock(String ingredient) {
        return ingredients.getOrDefault(ingredient, 0.0);
    }

    // Method to add stock
    public void addStock(String ingredient, double quantity) {
        ingredients.put(ingredient, ingredients.getOrDefault(ingredient, 0.0) + quantity);
    }

    // Get ingredients details
    public void getDetails() {
        for (Map.Entry<String, Double> entry : ingredients.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }
}
