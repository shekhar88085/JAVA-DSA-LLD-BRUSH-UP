package LLD.DesignPatterns.Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        CoffeeTemplate espresso = new Espresso();
        CoffeeTemplate cappuccino = new Cappuccino();

        System.out.println("Making espresso...");
        espresso.brewCoffee();

        System.out.println("\nMaking cappuccino...");
        cappuccino.brewCoffee();
    }
}