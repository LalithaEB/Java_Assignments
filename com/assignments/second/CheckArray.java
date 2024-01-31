package second;

import java.util.Scanner;

//Java program to check if an array of integers is without 0 and -1

public class CheckArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter elements of the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean check = false;

        for (int n : arr) {
            if (n == 0 || n == -1) {
                check = true;
                break;
            }
        }
        if (check)
            System.out.println("Array is not without 0/-1");
        else
            System.out.println("Array is without 0/-1");

        scanner.close();
    }
}
