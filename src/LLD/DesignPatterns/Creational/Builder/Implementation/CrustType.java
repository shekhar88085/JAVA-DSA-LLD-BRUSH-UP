package LLD.DesignPatterns.Creational.Builder.Implementation;

public enum CrustType {
    THIN(2),
    THICK(3),
    STUFFED(4);

    private final double price;

    CrustType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
