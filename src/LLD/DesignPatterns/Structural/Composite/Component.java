package LLD.DesignPatterns.Structural.Composite;

public interface Component {
    public String getName();
    int getSize();
    void displayStructure(String indent);
}
