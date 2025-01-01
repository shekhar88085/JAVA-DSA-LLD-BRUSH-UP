package LLD.DesignPatterns.Creational.Factory;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by Truck.");
    }
    
}
