package LLD.DesignPatterns.Creational.Builder.Implementation;

public enum AddOn {
    EXTRA_CHEESE(1.5),
    OLIVE_OIL(0.5),
    GARLIC_BREAD(2.5);

    private final double price;

    AddOn(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
