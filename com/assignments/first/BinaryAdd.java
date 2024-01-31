package first;

// Java program to add two binary numbers

import java.util.Scanner;

public class BinaryAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two binary numbers: ");

        String binary1 = scanner.nextLine();
        String binary2 = scanner.nextLine();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        System.out.println("Addition of binary numbers: " + Integer.toBinaryString(sum));

        scanner.close();
    }
}
