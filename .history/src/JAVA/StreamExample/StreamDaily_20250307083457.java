package JAVA.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDaily {
    public static void main(String[] args) {
        filterEvenNumbersAndPrint();
        convertListOFStringToUppercase();
        //allWaysToDefineAndInitializeList();
        sortInAscendingOrder();
    }

    private static void sortInAscendingOrder() {
        //✅ 1. Using sorted() (Streams - Default Ascending)
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4);
        System.out.println("Sort the numbers: " + numbers.stream().sorted().collect(Collectors.toList()));


        //✅ 2. Using sorted(Comparator.naturalOrder())
        List<Integer> numbers2 = Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4);
        System.out.println("Sort the numbers: " + numbers2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
        
    }

    private static void allWaysToDefineAndInitializeList() {
        // Arrays.asList() (Fixed-size List) partially immutable:
        // 🔹 You can modify elements (change values at existing indexes).
        // 🔹 You cannot add or remove elements (size is fixed).
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4); // Modification not allowed (throws
                                                                          // UnsupportedOperationException).
        // Using List.of() (Immutable List, Java 9+)
        List<Integer> numbers2 = List.of(3, 7, 2, 9, 1, 8, 6, 5, 4); // More concise, but immutable (can't add/remove
                                                                     // elements).
        // Using new ArrayList<>() + Arrays.asList() (Mutable List)
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4)); // ✅ Fully mutable (can
                                                                                            // add/remove elements).
        // Using new ArrayList<>() + addAll()
        List<Integer> numbers4 = new ArrayList<>();
        Collections.addAll(numbers, 3, 7, 2, 9, 1, 8, 6, 5, 4); // ✅ Mutable & works well with Collections.
        // Stream.of() + collect(Collectors.toList())
        List<Integer> numbers5 = Stream.of(3, 7, 2, 9, 1, 8, 6, 5, 4)
                .collect(Collectors.toList()); // Creates a new list dynamically.
        // Using IntStream (Primitive Stream)
        List<Integer> numbers6 = IntStream.of(3, 7, 2, 9, 1, 8, 6, 5, 4)
                .boxed()
                .collect(Collectors.toList()); // Efficient for handling primitives, then converting to List<Integer>.
    }

    private static void convertListOFStringToUppercase() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Convert to UpperCase and Print: " + uppercaseNames);
    }

    private static void filterEvenNumbersAndPrint() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(a -> (a % 2 == 0))
                // .toList(); // for java 16+
                .collect(Collectors.toList());
        System.out.println("Filter Even Number and Print: " + evenNumbers.toString());
    }
}
