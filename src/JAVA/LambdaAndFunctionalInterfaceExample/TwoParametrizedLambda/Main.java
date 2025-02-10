package JAVA.LambdaAndFunctionalInterfaceExample.TwoParametrizedLambda;

public class Main {
    public static void main(String[] args) {
        NumericTest isFactor = (a, b) -> (a % b) == 0;

        if(isFactor.test(4, 2)){
            System.out.println("4 is factor of 2");
        }
    }
}
