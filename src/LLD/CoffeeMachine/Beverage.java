package LLD.CoffeeMachine;

import java.util.Map;

public class Beverage {
    private int id;
    private String type;
    private Map<String, Double> ingredients;
    private int preperationTime;

    public Beverage(int id, String type, Map<String, Double> ingredients, int preperationTime) {
        this.id = id;
        this.type = type;
        this.ingredients = ingredients;
        this.preperationTime = preperationTime;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Map<String, Double> getIngredients() {
        return ingredients;
    }

    public int getPreperationTime() {
        return preperationTime;
    }

    public void setIngredients(Map<String, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPreperationTime(int preperationTime) {
        this.preperationTime = preperationTime;
    }

    @Override
    public String toString() {
        return "Beverage [id=" + id + ", type=" + type + ", ingredients=" + ingredients + ", preperationTime="
                + preperationTime + "]";
    }

    void getDetails() {
        System.out.println(toString());
    }

    public boolean isIngredientsAvailable(Inventory inventory) {
        for (Map.Entry<String, Double> entry : ingredients.entrySet()) {
            if (!inventory.isIngredientAvailable(entry.getKey(), entry.getValue())
                    || inventory.getStock(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

}
