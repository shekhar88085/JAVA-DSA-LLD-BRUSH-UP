import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalProgrammingExample {
    public void run() {
        // Your functional programming examples here
        System.out.println("Functional Programming Examples");

        //pure function
        System.out.println(square(5));

        // Higher-order function example
        System.out.println("Higher-Order Function Example:");
        int number = 5;

        // Using the higher-order function with a squaring function
        int result = operateOnNumbers(number, this::square);
        System.out.println("Result of squaring " + number + " is: " + result);

        // Using the higher-order function with a different function
        int doubledResult = operateOnNumbers(number, n -> n * 2);
        System.out.println("Result of doubling " + number + " is: " + doubledResult);

        // Creating and Using Functions that Return Other Functions
        Function<Integer, Integer> multiplier3 = createMultiplier(3);
        Function<Integer, Integer> multiplier5 = createMultiplier(5);
        // Use the multipliers
        System.out.println("5 multiplied by 5 is: " + multiplier5.apply(number));
        System.out.println("3 multiplied by 3 is: " + multiplier3.apply(number));

        // Function Composition Example
        System.out.println("Function Composition Example:");

        Function<Integer, Integer> addTwo = (n) -> n + 2;
        Function<Integer, Integer> multiplyByThree = (n) -> n * 3;

        // Compose the functions
        Function<Integer, Integer> addThenMultiply = composeFunctions(addTwo, multiplyByThree);
        result = addThenMultiply.apply(number);
        System.out.println("Result of adding 2 and then multiplying by 3 to " + number + " is: " + result);

        //Exercise 4: Advanced Function Composition
        //One that squares a number.
        Function<Integer, Integer> square = (n) -> n * n;
        //One that subtracts 5 from a number.
        Function<Integer, Integer> subtractFive = (n) -> n - 5;
        //One that multiplies a number by 2.
        Function<Integer, Integer> multiplyByTwo = (n) -> n * 2;

        Function<Integer, Integer> squareThenSubtractThenMultiply = composeThreeFunctions(square, subtractFive, multiplyByTwo);
        result = squareThenSubtractThenMultiply.apply(number);
        System.out.println("Result of sqauring, then substracting 5 and the multiplying 2 to " + number + " is: " + result);


        // Closure Example
        System.out.println("Closure Example:");

        // Create counters with different initial values
        Supplier<Integer> counter1 = createCounter(5);
        Supplier<Integer> counter2 = createCounter(10);

        // Call the counters and print the results
        System.out.println("Counter1: " + counter1.get());
        System.out.println("Counter1: " + counter1.get());
        System.out.println("Counter2: " + counter2.get());
        System.out.println("Counter1: " + counter1.get());
        System.out.println("Counter2: " + counter2.get());

        // Optional Example
        System.out.println("Optional Example:");

        // Test data
        String input1 = "Hello, world!";
        String input2 = "";

        // Find values using Optional
        Optional<String> optional1 = findValue(input1);
        Optional<String> optional2 = findValue(input2);

        // Check if a value is present and print it
        optional1.ifPresent(value -> System.out.println("Value 1: " + value));
        optional2.ifPresent(value -> System.out.println("Value 2: " + value));

        // Provide a default value if absent
        String defaultValue = "Default Value";
        System.out.println("Value 1 or default: " + optional1.orElse(defaultValue));
        System.out.println("Value 2 or default: " + optional2.orElse(defaultValue));

        // Transform the value if present
        Optional<String> transformed = optional1.map(value -> value.toUpperCase());
        System.out.println("Transformed Value 1: " + transformed.orElse("No Value"));

        // Handle the absence of a value manually
        if (optional2.isPresent()) {
            System.out.println("Value 2 (if present): " + optional2.get());
        } else {
            System.out.println("Value 2 is not present");
        }

        // Optional Example
        System.out.println("Optional Example:");

        // Test data
        String name1 = "Alice";
        String name2 = "";

        // Find names using Optional
        Optional<String> optionalName1 = findPersonName(name1);
        Optional<String> optionalName2 = findPersonName(name2);

        // Process names using Optional
        processName(optionalName1);
        processName(optionalName2);
    }

    // Method that demonstrates different ways to handle Optional
    public void processName(Optional<String> optionalName) {
        // Print the name if present
        optionalName.ifPresent(name -> System.out.println("Name: " + name));

        // Provide a default name if absent
        String defaultName = "No Name Provided";
        System.out.println("Name or default: " + optionalName.orElse(defaultName));

        // Convert the name to uppercase if present and print it
        String upperCaseName = optionalName.map(String::toUpperCase).orElse("No Name Provided");
        System.out.println("Uppercase Name: " + upperCaseName);

        // Handle the absence of a name
        if (!optionalName.isPresent()) {
            System.out.println("No name is present.");
        }
    }

    Optional<String> findPersonName(String name) {
        return (name != null && !name.isEmpty()) ? Optional.of(name) : Optional.empty();
    }

    // Method that returns an Optional based on a condition
    public Optional<String> findValue(String input) {
        return (input != null && !input.isEmpty()) ? Optional.of(input) : Optional.empty();
    }

    // Method that creates a closure acting as a counter
    public Supplier<Integer> createCounter(int initialValue) {
        // Variable to be captured by the closure
        int[] count = {initialValue};

        // Return a function (closure) that increments and returns the counter
        return () -> {
            count[0]++;
            return count[0];
        };
    }

    private Function<Integer, Integer> composeThreeFunctions(Function<Integer, Integer> square, Function<Integer, Integer> subtractFive, Function<Integer, Integer> multiplyByTwo) {
        return square.andThen(subtractFive.andThen(multiplyByTwo));
    }

    private Function<Integer, Integer> composeFunctions(Function<Integer, Integer> addTwo, Function<Integer, Integer> multiplyByThree) {
        return addTwo.andThen(multiplyByThree);
    }

    // Higher-order function
    public int operateOnNumbers(int number, Function<Integer, Integer> function) {
        return function.apply(number);
    }

    // Pure function to calculate the square of a number
    public int square(int number) {
        return number * number;
    }

    // Method that returns a function
    public Function<Integer, Integer> createMultiplier(int factor) {
        return (number) -> number * factor;
    }
}