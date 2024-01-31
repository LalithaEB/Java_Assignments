package first;

//Java program to convert a binary number to an octal number

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number: ");

        String binaryNumber = scanner.nextLine();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Octal number: " + octalNumber);

        scanner.close();
    }
}
