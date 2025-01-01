package LLD.DesignPatterns.Structural.Decorator;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage; // The component being wrapped

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
