package LLD.DesignPatterns.Creational.Builder.Implementation;

public enum Topping {
    PEPPERONI(2),
    MUSHROOMS(1.5),
    OLIVES(1),
    BACON(3);

    private final double price;

    Topping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
