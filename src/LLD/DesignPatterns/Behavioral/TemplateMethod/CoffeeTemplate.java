package LLD.DesignPatterns.Behavioral.TemplateMethod;

abstract class CoffeeTemplate {
    
    // Template Method
    public final void brewCoffee() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Common step
    private void boilWater() {
        System.out.println("Boiling water");
    }

    // Abstract step, to be implemented by subclasses
    protected abstract void brew();

    // Common step
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract step, to be implemented by subclasses
    protected abstract void addCondiments();
}