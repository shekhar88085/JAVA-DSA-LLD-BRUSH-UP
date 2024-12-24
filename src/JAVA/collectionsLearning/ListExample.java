package JAVA.collectionsLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {

        /*
        ArrayList: Maintains insertion order. Fast random access; slower for middle insertions/deletions.
        LinkedList: Maintains insertion order. Efficient for frequent insertions/deletions; slower random access.
        Vector: Maintains insertion order. Synchronized but slower in single-threaded contexts compared to ArrayList.
         */

        // 1. Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // 2. Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 3. Insert an element at a specific position
        numbers.add(1, 15); // Adds 15 at index 1

        // 4. Remove an element by value and by index
        numbers.remove(Integer.valueOf(20)); // Removes the element 20
        numbers.remove(2); // Removes the element at index 2

        // 5. Update an element at a specific index
        numbers.set(1, 25); // Replaces the element at index 1 with 25

        // 6. Retrieve and print elements by index
        System.out.println("Element at index 0: " + numbers.get(0));

        // 7. Check if the list contains a specific value
        System.out.println("List contains 25: " + numbers.contains(25));

        // 8. Clear the list and check if it's empty
        numbers.clear();
        System.out.println("List is empty: " + numbers.isEmpty());

        // Exercise 2: Sorting and Filtering
        System.out.println("=====================================================================================");
        System.out.println("Exercise 2: Sorting and Filtering");
        List<String> names = Arrays.asList("John", "Jane", "Alexander", "Chris", "Katie", "Bob");
        System.out.println("before sorting: " + names.toString());
        // sort it
        Collections.sort(names);
        System.out.println("after sorting: " + names.toString());

        // Filter the List to Include Only Names Longer than 4 Characters
        List<String> filteredNames = names.stream()
                .filter(a -> a.length() > 4)
                .collect(Collectors.toList());
        System.out.println("after filtering: " + filteredNames.toString());

        // Use a Lambda Expression to Sort the List in Descending Order of Names
        filteredNames.sort((a, b) -> b.compareTo(a));
        System.out.println("after sorting: " + filteredNames.toString());

        // Exercise 3: Mapping and Reducing
        System.out.println("=====================================================================================");
        System.out.println("Exercise 3: Mapping and Reducing");
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        System.out.println("Before operation on fruits:" + fruits.toString());
        // Use a Lambda Expression to Convert Each Word to Uppercase and Store It in a
        // New List
        List<String> uppercaseFruits = fruits.stream()
                .map(a -> a.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("After operation on fruits:" + uppercaseFruits.toString());

        // Use a Lambda Expression to Count the Number of Words That Contain the Letter
        // 'e'
        long countWordsWithE = fruits.stream()
                .filter(a -> a.contains("e"))
                .count();

        System.out.println("countWordsWithE:- " + countWordsWithE);

        // Exercise 4: Removing Elements
        System.out.println("=====================================================================================");
        System.out.println("Exercise 4: Removing Elements");
        // Create a modifiable list
        numbers = new ArrayList<>(Arrays.asList(5, 12, 8, 21, 7, 18, 3, 14));
        System.out.println("Before removing odd numbers: " + numbers);

        // Remove all odd numbers using removeIf
        numbers.removeIf(a -> (a & 1) == 1); // (a & 1) == 1 checks if the number is odd
        System.out.println("After removing odd numbers: " + numbers);

        // Removing the first element
        numbers.remove(0);
        System.out.println("After removing the first element: " + numbers);

        // Remove element by value
        numbers.remove(Integer.valueOf(18));
        System.out.println("After removing 18 by value: " + numbers);

        // Exercise 5: Transforming and Aggregating
        System.out.println("=====================================================================================");
        System.out.println("Exercise 5: Transforming and Aggregating");
        
        numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println("Before operation: " + numbers);

        // Transform the List by Doubling Each Value
        List<Integer> doubledNumbers = numbers.stream()
                .map(a -> a * 2)
                .collect(Collectors.toList());
        System.out.println("After doubling each value: " + doubledNumbers);

        // Sum All the Values in the Transformed List
        int sum = doubledNumbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // Find the Maximum Value in the Transformed List
        Optional<Integer> max = doubledNumbers.stream()
                .reduce((a, b) -> a > b ? a : b);
        System.out.println("Maximum Value: " + max.orElse(null)); 

    }
}
