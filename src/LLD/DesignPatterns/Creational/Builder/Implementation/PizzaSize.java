package LLD.DesignPatterns.Creational.Builder.Implementation;

public enum PizzaSize {
    SMALL(5),
    MEDIUM(10),
    LARGE(15);

    private final double price;

    PizzaSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
