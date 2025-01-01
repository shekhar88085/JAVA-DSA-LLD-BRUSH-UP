package LLD.DesignPatterns.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> shapes = new HashMap<>();

    public void addShape(String key, Shape shape) {
        shapes.put(key, shape);
    }

    public Shape getShape(String key) {
        return shapes.get(key).clone();
    }
}