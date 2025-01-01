package LLD.DesignPatterns.Structural.Decorator;

public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 15.0;
    }
}