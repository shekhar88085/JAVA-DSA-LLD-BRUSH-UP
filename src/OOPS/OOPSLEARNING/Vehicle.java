package OOPS.OOPSLEARNING;

// Abstract class Vehicle
public abstract class Vehicle {
    // Abstract method to be implemented by subclasses
    abstract void move();

    // Concrete method to start the engine
    void startEngine() {
        System.out.println("Engine Started");
    }
}

// Repairable interface
public interface Repairable {
    // Method to repair a vehicle
    void repair();
}

// Car class extends Vehicle and implements Repairable
public class Car extends Vehicle implements Repairable {

    @Override
    void move() {
        System.out.println("Car is driving");
    }

    @Override
    public void repair() {
        System.out.println("Car is being repaired");
    }
}

// Bike class extends Vehicle and implements Repairable
public class Bike extends Vehicle implements Repairable {

    @Override
    void move() {
        System.out.println("Bike is pedaling");
    }

    @Override
    public void repair() {
        System.out.println("Bike is being repaired");
    }
}

// Main class to test the functionality
public class Abstraction {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Call methods for Car
        System.out.println("Car Operations:");
        car.startEngine();
        car.move();
        ((Repairable) car).repair();  // Casting to Repairable to call repair

        // Call methods for Bike
        System.out.println("\nBike Operations:");
        bike.startEngine();
        bike.move();
        ((Repairable) bike).repair();  // Casting to Repairable to call repair
    }
}
