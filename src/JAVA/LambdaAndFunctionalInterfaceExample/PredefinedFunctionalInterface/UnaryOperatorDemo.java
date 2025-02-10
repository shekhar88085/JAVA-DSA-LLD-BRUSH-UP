package JAVA.LambdaAndFunctionalInterfaceExample.PredefinedFunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> toUppercase = (n) -> n.toUpperCase();
        System.out.println(toUppercase.apply("vbnm,./"));
    }
}
