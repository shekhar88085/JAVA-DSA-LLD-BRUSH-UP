package JAVA.StreamExample;

import java.util.Arrays;
import java.util.List;

public class StreamDaily {
    public static void main(String[] args) {
        filterEvenNumbersAndPrint();
    }

    private static void filterEvenNumbersAndPrint() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(a -> (a % 2 == 0))
                .toList();
        System.out.println("Fileter Even Number and Print: " + evenNumbers.toString());
    }
}
