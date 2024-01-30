package first;

import java.util.Scanner;

//Java program that accepts two integer values from the user and returns the largest value. However, if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integer values: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = checkNum(num1, num2);
        System.out.println(result);

        scanner.close();
    }

    public static int checkNum(int num1, int num2) {
        if (num1 % 6 == num2 % 6) {
            if (num1 < num2)
                return num1;
            else
                return num2;
        } else if (num1 == num2)
            return 0;
        else if (num1 < num2)
            return num2;
        else
            return num1;
    }
}
