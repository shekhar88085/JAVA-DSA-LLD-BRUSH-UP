package JAVA.LambdaAndFunctionalInterfaceExample.PredefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> greet = (n) -> System.out.println("Hello, " + n + "!"); 
        greet.accept("Edar");
    }
}
