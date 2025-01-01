package LLD.DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(Component component) {
        children.add(component);
    }

    public void removeComponent(Component component) {
        children.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (Component child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (Component child : children) {
            child.displayStructure(indent + "  ");
        }
    }
}