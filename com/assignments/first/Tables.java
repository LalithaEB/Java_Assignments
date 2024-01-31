package first;

// Java program that takes a number as input and prints its multiplication table up to 10. (Hint- use Loop).

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        System.out.println("Multiplication of " + number + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        scanner.close();
    }
}
