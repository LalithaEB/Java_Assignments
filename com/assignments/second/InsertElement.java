package second;

import java.util.Arrays;
import java.util.Scanner;

//Java program to insert an element (specific position) into an array

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of array elements: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.println("Enter the position of element to be inserted: ");
        int index = scanner.nextInt();

        int[] newArr = insertElement(arr, element, index);

        System.out
                .println("Array after inserting " + element + " at index " + index + " is: " + Arrays.toString(newArr));

        scanner.close();
    }

    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];

        int j = 0;
        for (int i = 0; i < index; i++) {
            newArr[j++] = arr[i];
        }
        newArr[index] = element;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
}
