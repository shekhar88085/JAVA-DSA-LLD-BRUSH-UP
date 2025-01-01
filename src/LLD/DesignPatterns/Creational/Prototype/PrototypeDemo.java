package LLD.DesignPatterns.Creational.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        // Pre-configured shapes
        Circle circle = new Circle("1", "Red", 5);
        Rectangle rectangle = new Rectangle("2", "Blue", 10, 20);

        registry.addShape("RedCircle", circle);
        registry.addShape("BlueRectangle", rectangle);

        // Cloning shapes
        Circle clonedCircle = (Circle) registry.getShape("RedCircle");
        clonedCircle.setRadius(10); // Customize the cloned object

        Rectangle clonedRectangle = (Rectangle) registry.getShape("BlueRectangle");
        clonedRectangle.setWidth(30); // Customize the cloned object

        // Display
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}