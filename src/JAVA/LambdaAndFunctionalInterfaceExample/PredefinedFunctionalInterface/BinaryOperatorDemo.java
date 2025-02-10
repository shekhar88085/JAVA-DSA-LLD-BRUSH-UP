package JAVA.LambdaAndFunctionalInterfaceExample.PredefinedFunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println(max.apply(33, 22));

    }
}
