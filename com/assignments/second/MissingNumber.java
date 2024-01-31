package second;

import java.util.Scanner;

//Java program to find a missing number in an array
//Assuming the array numbers are from 1 to n

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array including the missing number: ");
        int size = scanner.nextInt();

        int[] arr = new int[size - 1];
        System.out.println("Enter " + (size - 1) + " elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int originalSum = 0;
        int expectedSum = size * (size + 1) / 2;

        for (int n : arr) {
            originalSum += n;
        }

        int missingNumber = expectedSum - originalSum;

        System.out.println("Missing number is: " + missingNumber);

        scanner.close();
    }
}
