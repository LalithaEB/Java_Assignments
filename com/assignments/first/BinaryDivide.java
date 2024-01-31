package first;

//Java program to divide two binary numbers

import java.util.Scanner;

public class BinaryDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two binary numbers: ");

        String binary1 = scanner.nextLine();
        String binary2 = scanner.nextLine();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int quotient = num1 / num2;

        System.out.println("Division of binary numbers: " + Integer.toBinaryString(quotient));

        scanner.close();
    }
}
