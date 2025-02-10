package JAVA.LambdaAndFunctionalInterfaceExample.PredefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of 3: " + factorial.apply(3)); // Output: 6
        System.out.println("Factorial of 5: " + factorial.apply(5)); // Output: 120

    }
}
