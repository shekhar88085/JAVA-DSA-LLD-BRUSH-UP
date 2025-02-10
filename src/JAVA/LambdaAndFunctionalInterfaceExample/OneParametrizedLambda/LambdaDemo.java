package JAVA.LambdaAndFunctionalInterfaceExample.OneParametrizedLambda;

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("10 is even");
        if (!isEven.test(9))
            System.out.println("9 is not even");

        NumericTest isNegative = (n) -> (n >= 0);

        if (isNegative.test(10))
            System.out.println("10 is Positive");
        if (!isNegative.test(-1))
            System.out.println("9 is Negative");

    }
}
