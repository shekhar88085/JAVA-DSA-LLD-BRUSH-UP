package OOPS.OOPSLEARNING;

import java.util.ArrayList;
import java.util.List;

// Abstract Animal class
abstract class Animal {
    abstract void sound();

    // Optional move method for each animal to override
    void move() {
        System.out.println("Animal is moving...");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }

    @Override
    void move() {
        System.out.println("Dog is running!");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }

    @Override
    void move() {
        System.out.println("Cat is sneaking around!");
    }
}

// Bird class extending Animal
class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Tweet");
    }

    @Override
    void move() {
        System.out.println("Bird is flying!");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating a list of Animal type to hold different animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        // Looping through the list and calling sound() and move() methods
        for (Animal animal : animals) {
            animal.sound(); // Each animal will make its own sound
            animal.move(); // Each animal has its own way of moving
            System.out.println("---");
        }
    }
}
