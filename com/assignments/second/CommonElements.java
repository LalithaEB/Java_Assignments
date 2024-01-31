package second;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Java program to find common elements between two integer arrays

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int num = scanner.nextInt();

        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        System.out.println("Enter " + num + " elements to array1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter " + num + " elements to array2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int val : arr1) {
            if (!set1.add(val))
                set2.add(val);
        }
        for (int val : arr2) {
            if (!set1.add(val))
                set2.add(val);
        }

        System.out.println("Common elements: " + set2);

        scanner.close();
    }
}
