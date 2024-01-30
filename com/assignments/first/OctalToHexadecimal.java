package first;

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an octal number: ");

        String octalNumber = scanner.nextLine();

        int decimalNumber = Integer.parseInt(octalNumber, 8);
        String hexadecimalNum = Integer.toHexString(decimalNumber);

        System.out.println("Hexa decimal number is: " + hexadecimalNum);

        scanner.close();
    }
}
