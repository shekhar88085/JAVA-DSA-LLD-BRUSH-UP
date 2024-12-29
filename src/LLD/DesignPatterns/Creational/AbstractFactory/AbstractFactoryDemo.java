package LLD.DesignPatterns.Creational.AbstractFactory;
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Use Modern Furniture Factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn();
        modernSofa.lieOn();
        modernTable.putThingsOn();

        System.out.println();

        // Use Victorian Furniture Factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        Table victorianTable = victorianFactory.createTable();

        victorianChair.sitOn();
        victorianSofa.lieOn();
        victorianTable.putThingsOn();
    }
}
