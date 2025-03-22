package JAVA.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDaily {
    public static void main(String[] args) {
        filterEvenNumbersAndPrint();
        convertListOFStringToUppercase();
        // allWaysToDefineAndInitializeList();
        sortInAscendingOrder();
        sortInDescendingOrder();
        findDistinctNumbers(); // distinct()
        findMaxAndMin(); // min()/max()
        findSumAndProduct(); // reduce()
        groupingAndPartition(); // groupingBy()/partitioningBy()
    }

    private static void groupingAndPartition() {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65, 70, 85, 90, 100);

        // 🔹 1️⃣ Grouping by Even and Odd
        Map<String, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "EVEN" : "ODD"));

        System.out.println("Grouped by Even/Odd: " + groupedNumbers);

        // 🔹 2️⃣ Partitioning into Even and Odd
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Partitioned into Even/Odd: " + partitionedNumbers);
    }

    private static void findSumAndProduct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of all Numbers: " + numbers.stream().reduce(0, (a, b) -> a + b));
        System.out.println("Product of all Numbers: " + numbers.stream().reduce(1, (a, b) -> a * b));
    }

    private static void findMaxAndMin() {
        List<Integer> numbers = Arrays.asList(10, 25, 3, 7, 15, 2, 30, 18);
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum number: " + maxNumber.orElse(-1));
        System.out.println("Minimum number: " + minNumber.orElse(-1));

    }

    private static void findDistinctNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 1, 6, 4, 7);
        System.out.println("Before Distinct: " + numbers);
        System.out.println("Distinct Numbers: " + numbers.stream().distinct().collect(Collectors.toList()));
    }

    private static void sortInDescendingOrder() {
        // ✅ 1. Using sorted(Comparator.reverseOrder()) (Streams - Descending)
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4);
        System.out.println("Sort the numbers (Descending): " +
                numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        // ✅ 2. Using Collections.sort() with reverseOrder() (In-place Sorting)
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4));
        Collections.sort(numbers2, Collections.reverseOrder());
        System.out.println("Sort the numbers (Descending): " + numbers2);

        // ✅ 3. Using List.sort() with Comparator.reverseOrder() (In-place Sorting)
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4));
        numbers3.sort(Comparator.reverseOrder());
        System.out.println("Sort the numbers (Descending): " + numbers3);

        /*
         * 🔥 Which One to Use?
         * Method Creates New List? Modifies Original? Removes Duplicates?
         * sorted(Comparator.reverseOrder()) ✅ Yes ❌ No ❌ No
         * Collections.sort(Collections.reverseOrder()) ❌ No ✅ Yes ❌ No
         * List.sort(Comparator.reverseOrder()) ❌ No ✅ Yes ❌ No
         */
    }

    private static void sortInAscendingOrder() {
        // ✅ 1. Using sorted() (Streams - Default Ascending)
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4);
        System.out.println("Sort the numbers: " + numbers.stream().sorted().collect(Collectors.toList()));

        // ✅ 2. Using sorted(Comparator.naturalOrder())
        List<Integer> numbers2 = Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4);
        System.out.println("Sort the numbers: "
                + numbers2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));

        // ✅ 3. Using Collections.sort() (In-place Sorting)
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 1, 8, 6, 5, 4));
        Collections.sort(numbers);

        // ✅ 4. Using List.sort() (In-place Sorting)
        numbers.sort(Integer::compareTo);

        /*
         * 🔥 Which One to Use?
         * Method Creates New List? Modifies Original? Removes Duplicates?
         * sorted() ✅ Yes ❌ No ❌ No
         * sorted(Comparator.naturalOrder()) ✅ Yes ❌ No ❌ No
         * Collections.sort() ❌ No ✅ Yes ❌ No
         * List.sort() ❌ No ✅ Yes ❌ No
         * TreeSet ✅ Yes ❌ No ✅ Yes
         */
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
