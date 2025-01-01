package LLD.DesignPatterns.Structural.Composite;

public class File implements Component {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + "KB)");
    }
}