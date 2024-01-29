package lambdaexpressions;

import java.util.function.IntUnaryOperator;

public class Factorial {
    public static void main(String[] args) {
        int number = 6;

        IntUnaryOperator factorial = n -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int factorialResult = factorial.applyAsInt(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }
}
