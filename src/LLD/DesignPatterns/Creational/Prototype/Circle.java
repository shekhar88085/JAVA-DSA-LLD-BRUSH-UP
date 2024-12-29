package LLD.DesignPatterns.Creational.Prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(String id, String color, int radius) {
        super(id, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius + ", color: " + getColor());
    }
}