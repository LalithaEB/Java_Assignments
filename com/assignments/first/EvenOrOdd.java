package first;

import java.util.Scanner;

//Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int result = checkNum(number);

        System.out.println(result);
        scanner.close();
    }

    public static int checkNum(int number) {
        if (number % 2 == 0)
            return 1;
        else
            return 0;
    }
}
