package exceptionhandling;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        try {
            int num = scanner.nextInt();
            checkEvenOrOdd(num);
            System.out.println("Number is even");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void checkEvenOrOdd(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}