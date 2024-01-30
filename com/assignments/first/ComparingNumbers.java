package first;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to compare: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equal");
        } else if (num1 > num2) {
            System.out.println("Number 1 is greater than Number 2");
        } else {
            System.out.println("Number 1 is less than Number 2");
        }

        scanner.close();
    }
}
