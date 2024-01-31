package second;

import java.util.InputMismatchException;
import java.util.Scanner;

//Java program to find the maximum and minimum value of an array

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter number of elements in an array: ");
            int num = scanner.nextInt();

            int[] arr = new int[num];

            System.out.println("Enter elements in array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            int min = arr[0], max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            System.out.println("Min- " + min + " Max- " + max);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integer values");
        } finally {
            scanner.close();
        }
    }
}
