package second;

import java.util.Arrays;
import java.util.Scanner;

//Java program to remove a specific element from an array.

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter element to remove from the array: ");
        int element = scanner.nextInt();

        int[] newArr = removeElement(arr, element);

        System.out.println("Array after removing " + element + " is: " + Arrays.toString(newArr));

        scanner.close();
    }

    public static int[] removeElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index)
                    newArr[j++] = arr[i];
            }
            return newArr;
        } else {
            return arr;
        }
    }
}
