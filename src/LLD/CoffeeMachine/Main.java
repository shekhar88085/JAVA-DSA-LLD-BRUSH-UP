package LLD.CoffeeMachine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // Create the inventory with some ingredients
        Map<String, Double> initialIngredients = new HashMap<>();
        initialIngredients.put("Coffee Beans", 100.0);
        initialIngredients.put("Milk", 50.0);
        initialIngredients.put("Sugar", 30.0);

        Inventory inventory = new Inventory(initialIngredients);

        // Create a coffee machine with a button panel
        Button buttonPanel = new Button();
        CofeeMachine coffeeMachine = new CofeeMachine(1, buttonPanel, inventory);

        // Create a beverage
        Map<String, Double> beverageIngredients = new HashMap<>();
        beverageIngredients.put("Coffee Beans", 10.0);
        beverageIngredients.put("Milk", 5.0);
        beverageIngredients.put("Sugar", 2.0);

        Beverage coffee = new Beverage(1, "Espresso", beverageIngredients, 3); // Espresso takes 3 minutes

        // Brew the beverage and update stock
        if (coffeeMachine.brewBeverage(coffee)) {
            System.out.println("Beverage brewed successfully!");
        } else {
            System.out.println("Failed to brew the beverage due to insufficient ingredients.");
        }

        // Check the updated inventory
        System.out.println("Updated Inventory: ");
        inventory.getDetails();
    }
}