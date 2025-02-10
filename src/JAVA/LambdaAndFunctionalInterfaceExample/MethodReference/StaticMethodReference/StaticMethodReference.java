package JAVA.LambdaAndFunctionalInterfaceExample.MethodReference.StaticMethodReference;

public class StaticMethodReference {
    // Static method
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // Using lambda
        MyFunction lambdaSquare = (n) -> StaticMethodReference.square(n);

        // Using method reference
        MyFunction refSquare = StaticMethodReference::square;

        System.out.println(lambdaSquare.apply(5));  // Output: 25
        System.out.println(refSquare.apply(5));     // Output: 25
    }
}
