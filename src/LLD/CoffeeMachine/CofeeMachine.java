package LLD.CoffeeMachine;



public class CofeeMachine {
    private int id;
    private Button button;
    private Inventory inventory;
    public CofeeMachine(int id, Button button, Inventory inventory) {
        this.id = id;
        this.button = button;
        this.inventory = inventory;
    }
    public int getId() {
        return id;
    }
    public Button getButton() {
        return button;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public boolean brewBeverage(Beverage beverage) {
        if (beverage.isIngredientsAvailable(inventory)) {
            // Start brewing and deduct ingredients from inventory
            System.out.println("Brewing " + beverage.getType());
            // After brewing, update inventory
            updateInventory(beverage);
            return true;
        } else {
            System.out.println("Not enough ingredients to brew " + beverage.getType());
            return false;
        }
    }
    
    public void updateInventory(Beverage beverage) {
        // Logic to reduce stock from inventory based on ingredients used for the beverage
        inventory.updateStock(beverage.getIngredients());
    }
    
}
