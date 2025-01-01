package LLD.DesignPatterns.Behavioral.TemplateMethod;

public class Cappuccino extends CoffeeTemplate {

    @Override
    protected void brew() {
        System.out.println("Brewing cappuccino");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
}

