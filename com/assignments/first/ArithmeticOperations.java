package first;

//Java program to print the sum of two numbers, subtraction, multiplication, division

public class ArithmeticOperations {
    public static void main(String[] args) {
        int number1 = 20, number2 = 10;

        System.out.println("Addition of 2 numbers: " + (number1 + number2));
        System.out.println("Subtraction of 2 numbers: " + (number1 - number2));
        System.out.println("Multiplication of 2 numbers: " + (number1 * number2));
        System.out.println("Division of 2 numbers: " + (number2 != 0 ? (number1 / number2) : "Invalid"));
    }
}