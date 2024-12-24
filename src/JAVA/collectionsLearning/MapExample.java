package JAVA.collectionsLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    /*
    HashMap: No order guarantees. Fast for key-based lookups and operations.
    LinkedHashMap: Maintains insertion order. Slightly slower than HashMap.
    TreeMap: Maintains keys in ascending order (natural order or by comparator). Slower but useful for range queries and ordered traversals.
     */

    public static void main(String[] args) {
        // Exercise 1: Working with HashMap
        System.out.println("=====================================================================================");
        System.out.println("Exercise 1: Working with HashMap");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 28);
        map.put("Eva", 22);
        System.out.println("HashMap before any operation:" + map);
        // remove entry by key
        map.remove("Alice");
        System.out.println("HashMap after remove operation:" + map);
        // update
        map.put("Bob", 100);
        System.out.println("HashMap after update operation:" + map);
        // contains key
        System.out.println("David exists: " + map.containsKey("David"));
        // contains value
        System.out.println("100 age exists: " + map.containsValue(100));

        // Exercise 2: Iterating Over a HashMap
        System.out.println("=====================================================================================");
        System.out.println("Exercise 2: Iterating Over a HashMap");

        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "Washington");
        countries.put("France", "Paris");
        countries.put("India", "New Delhi");
        countries.put("Japan", "Tokyo");
        countries.put("Australia", "Canberra");
        // Iterating with a for-each loop
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterating with a lambda expression
        countries.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        // Exercise 3: Using TreeMap for Sorted Entries
        System.out.println("=====================================================================================");
        System.out.println("Exercise 3: Using TreeMap for Sorted Entries");
        TreeMap<String, Integer> studentScores = new TreeMap<>();
        studentScores.put("Ayush", 75);
        studentScores.put("Akash", 84);
        studentScores.put("Me", 55);
        studentScores.put("Ravi", 75);
        studentScores.put("Ashish", 100);
        System.out.println("TreeMap before and operation:" + studentScores);

        // sort by value i.e. scores
        // Sorting by values (scores) using a list of Map.Entry
        List<Map.Entry<String, Integer>> sortedByValue = new ArrayList<>(studentScores.entrySet());

        // Sort the list based on scores (values)
        sortedByValue.sort((a, b) -> a.getValue().compareTo(b.getValue()));

        // Print the sorted entries
        System.out.println("TreeMap sorted by values (scores):");
        sortedByValue.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        // Exercise 4: Exercise: Working with LinkedHashMap
        System.out.println("=====================================================================================");
        System.out.println("Exercise 4: Exercise: Working with LinkedHashMap");
        // Step 1: Create a LinkedHashMap and add entries
        LinkedHashMap<String, Integer> products = new LinkedHashMap<>();
        products.put("Laptop", 100);
        products.put("Phone", 90);
        products.put("Tablet", 93);
        products.put("Earphone", 40);
        products.put("Charger", 65);
        System.out.println("LinkedHashMap before any operation: " + products);

        // Step 2: Access the price of "Phone" (this will not change the order since no access order)
        // However, you can simulate access order by removing and re-adding it.
        products.get("Phone"); // Accessing value
        
        // Simulate access order by removing and re-adding
        products.put("Phone", products.remove("Phone"));
        System.out.println("LinkedHashMap after accessing 'Phone': " + products);

        // Step 3: Remove the "Mouse" from the map
        // In this case, "Mouse" doesn't exist in the map, so this operation will not affect the map.
        products.remove("Mouse"); // No effect since "Mouse" is not present

        // Step 4: Check if a key and value exist
        System.out.println("Contains 'Tablet': " + products.containsKey("Tablet"));
        System.out.println("Contains value 800: " + products.containsValue(800));

        // Step 5: Increase all prices by 10% using lambda
        products.replaceAll((key, value) -> (int) (value * 1.10));
        System.out.println("LinkedHashMap after increasing prices by 10%: " + products);

    }
}
