package JAVA.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDaily {
    public static void main(String[] args) {
        filterEvenNumbersAndPrint();
        convertListOFStringToUppercase();
    }

    private static void convertListOFStringToUppercase() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
        List<String> uppercaseNames = names.stream()
                .map(String :: toUpperCase)
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
