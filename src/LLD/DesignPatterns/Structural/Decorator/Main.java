package LLD.DesignPatterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        // Base beverage
        Beverage espresso = new Espresso();

        // Add decorators
        Beverage milkEspresso = new MilkDecorator(espresso);
        Beverage sugarMilkEspresso = new SugarDecorator(milkEspresso);
        Beverage deluxeEspresso = new WhippedCreamDecorator(sugarMilkEspresso);

        System.out.println(deluxeEspresso.getDescription());
        System.out.println("Total Cost: $" + deluxeEspresso.getCost());
    }
}