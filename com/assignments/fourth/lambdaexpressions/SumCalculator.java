package lambdaexpressions;

import java.util.function.IntBinaryOperator;

public class SumCalculator {
    public static void main(String[] args) {
        Sum.sumOfIntegers(50, 40);
    }
}

// Method-1: using an interface
interface SumCalculate {
    int sum(int num1, int num2);
}

class Sum {
    public static void sumOfIntegers(int num1, int num2) {
        SumCalculate sumCalculate = (n1, n2) -> n1 + n2;
        int result = sumCalculate.sum(num1, num2);

        System.out.println("Sum of 2 integers: " + result);

        // Method-2: using IntBinaryOperator
        IntBinaryOperator sum = (n1, n2) -> n1 + n2;
        int result1 = sum.applyAsInt(num1, num2);

        System.out.println("Sum of 2 integers: " + result1);
    }
}
