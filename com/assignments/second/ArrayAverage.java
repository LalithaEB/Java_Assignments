package second;

//Java program to sum the values of an array and the average value of array elements

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int s : arr) {
            sum += s;
        }

        double average = sum / num;

        System.out.println("Sum of array values: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
