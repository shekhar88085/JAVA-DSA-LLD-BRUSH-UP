package JAVA.collectionsLearning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
// HashSet: Fast and unordered.
// LinkedHashSet: Preserves insertion order, slightly slower than HashSet.
// TreeSet: Sorted, provides methods for accessing the smallest and largest elements.
    public static void main(String[] args) {
        // Exercise 1: Working with HashSet
        System.out.println("=====================================================================================");
        System.out.println("Exercise 1: Working with HashSet");
        HashSet<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Set before nay operation:- " + set);
        set.add(25);
        set.remove(40);
        System.out.println("Set After nay operation:- " + set);
        System.out.println("Does it contains 40:- " + set.contains(40));

        // Exercise 2: Exploring LinkedHashSet
        System.out.println("=====================================================================================");
        System.out.println("Exercise 2: Exploring LinkedHashSet");
        HashSet<String> fruits = new LinkedHashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        System.out.println("Fruits before any operation: "+fruits);
        fruits.add("grape");
        fruits.remove("banana");
        fruits.add("apple");
        System.out.println("Fruits after any operation: "+fruits);

        // Exercise 3: Exploring TreeSet
        System.out.println("=====================================================================================");
        System.out.println("Exercise 3: Exploring TreeSet");
        TreeSet<String> animals = new TreeSet<>(Arrays.asList("lion", "tiger", "elephant", "zebra", "giraffe"));
        System.out.println("Treeset before any operation: "+animals);
        animals.add("monkey");
        animals.remove("elephant");
        System.out.println("Does it contain zebra?? "+animals.contains("zebra"));
        System.out.println("First Element: "+animals.first());
        System.out.println("Last Element: "+animals.last());
        System.out.println("Treeset after any operation: "+animals);
    }
}
