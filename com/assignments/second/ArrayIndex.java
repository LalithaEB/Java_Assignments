package second;

import java.util.Scanner;

//Java program to find the index of an array element

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter element to find its index: ");
        int element = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < num; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + element + " found at index: " + index);
        } else {
            System.out.println("Element " + element + " not found in array");
        }

        scanner.close();
    }
}
