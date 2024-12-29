package LLD.DesignPatterns.Creational.Builder.Implementation;

import java.util.List;

public class Pizza {
    private PizzaSize size;
    private CrustType crustType;
    private List<Topping> toppings;
    private List<AddOn> addOns;
    private double cost;

    public Pizza(PizzaSize size, CrustType crustType, List<Topping> toppings, List<AddOn> addOns) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        this.addOns = addOns;
        this.cost = calculateCost();
    }

    private double calculateCost() {
        double totalCost = size.getPrice() + crustType.getPrice();
        for(Topping topping:toppings){
            totalCost += topping.getPrice();
        }
        for(AddOn addOn: addOns){
            totalCost += addOn.getPrice();
        }
        return totalCost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crustType + ", toppings=" + toppings + ", addOns=" + addOns + ", cost=" + cost + "]";
    }

}
