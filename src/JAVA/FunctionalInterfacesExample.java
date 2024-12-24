package JAVA;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {
    public void run() {
        // Function: Converts a string to its length
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        // Predicate: Checks if a string is empty
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("'Hello' is empty: " + isEmpty.test("Hello"));
        System.out.println("'' is empty: " + isEmpty.test(""));

        // Consumer: Prints a string
        Consumer<String> printString = s -> System.out.println("Printing: " + s);
        printString.accept("Hello, World!");

        // Supplier: Provides a default string value
        Supplier<String> defaultString = () -> "Default String";
        System.out.println("Default String: " + defaultString.get());

        //advance

        // UnaryOperator: Increment a number
        UnaryOperator<Integer> increment = n -> n + 1;
        System.out.println("Increment 5: " + increment.apply(5));

        // BinaryOperator: Add two numbers
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Add 3 and 4: " + add.apply(3, 4));

        // BiFunction: Concatenate two strings
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;
        System.out.println("Concatenate 'Hello' and 'World': " + concatenate.apply("Hello", "World"));

        // BiPredicate: Check if two strings are equal
        BiPredicate<String, String> areEqual = (s1, s2) -> s1.equals(s2);
        System.out.println("Are 'Hello' and 'hello' equal? " + areEqual.test("Hello", "hello"));

        // BiConsumer: Print two strings
        BiConsumer<String, String> printTwoStrings = (s1, s2) -> System.out.println("String 1: " + s1 + ", String 2: " + s2);
        printTwoStrings.accept("Hello", "World");
    }
}
