package LLD.DesignPatterns.Structural.Decorator;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}