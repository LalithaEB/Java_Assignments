package first;

//Java program to print the sum of two numbers, subtraction, multiplication, division take input from user

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        double number1, number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        number1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        number2 = scanner.nextInt();

        System.out.println("Addition of 2 numbers: " + (number1 + number2));
        System.out.println("Subtraction of 2 numbers: " + (number1 - number2));
        System.out.println("Multiplication of 2 numbers: " + (number1 * number2));
        System.out.println("Division of 2 numbers: " + (number2 != 0 ? (number1 / number2) : "Invalid"));
        scanner.close();
    }
}