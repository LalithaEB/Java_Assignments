package second;

import java.util.Arrays;
import java.util.Scanner;

//Java program to find the second smallest element in an array

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int secondSmallest;

        if (arr.length < 2) {
            System.out.println("Second smallest element does not exist");
        } else {
            secondSmallest = arr[1];
            System.out.println("Second smallest element is: " + secondSmallest);
        }

        scanner.close();
    }
}
