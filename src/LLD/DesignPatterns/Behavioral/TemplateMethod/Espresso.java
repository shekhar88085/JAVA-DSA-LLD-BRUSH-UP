package LLD.DesignPatterns.Behavioral.TemplateMethod;

public class Espresso extends CoffeeTemplate {

    @Override
    protected void brew() {
        System.out.println("Brewing espresso");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar");
    }
}
