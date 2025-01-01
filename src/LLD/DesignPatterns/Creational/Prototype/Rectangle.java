package LLD.DesignPatterns.Creational.Prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String id, String color, int width, int height) {
        super(id, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + ", height: " + height + ", color: " + getColor());
    }
}