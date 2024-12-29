package LLD.DesignPatterns.Creational.Builder.Implementation;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    PizzaSize size;
    private CrustType crustType;
    private List<Topping> toppings;
    private List<AddOn> addOns;

    public PizzaBuilder() {
        // Initialize the lists
        toppings = new ArrayList<>();
        addOns = new ArrayList<>();
    }

    public PizzaBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setCrustType(CrustType crustType) {
        this.crustType = crustType;
        return this;
    }

    public PizzaBuilder setToppings(List<Topping> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder setAddOns(List<AddOn> addOns) {
        this.addOns = addOns;
        return this;
    }

    public PizzaBuilder addTopping(Topping topping) {
        toppings.add(topping);
        return this;
    }

    public PizzaBuilder addAddOn(AddOn addOn) {
        addOns.add(addOn);
        return this;
    }

    public Pizza build() {
        return new Pizza(size, crustType, toppings, addOns);
    }

    public Object setToppings(Topping pepperoni) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setToppings'");
    }
}
