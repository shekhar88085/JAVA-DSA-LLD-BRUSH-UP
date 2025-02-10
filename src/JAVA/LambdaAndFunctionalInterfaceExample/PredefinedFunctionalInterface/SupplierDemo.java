package JAVA.LambdaAndFunctionalInterfaceExample.PredefinedFunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hi! How Are You";
        System.out.println(message.get());
    }
}
