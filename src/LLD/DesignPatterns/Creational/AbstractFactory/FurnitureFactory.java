package LLD.DesignPatterns.Creational.AbstractFactory;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
