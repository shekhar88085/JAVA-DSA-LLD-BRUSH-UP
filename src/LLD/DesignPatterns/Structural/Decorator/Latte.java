package LLD.DesignPatterns.Structural.Decorator;

public class Latte implements Beverage {

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getCost() {
        return 60.0;
    }
}