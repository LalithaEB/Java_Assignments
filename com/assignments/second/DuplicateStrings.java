package second;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Java program to find duplicate values in an array of string values

public class DuplicateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements in an array: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[num];
        System.out.println("Enter " + num + " string values in array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println("Array is: " + Arrays.toString(arr));

        Set<String> uniqueValues = new HashSet<>();
        Set<String> duplicateValues = new HashSet<>();

        for (String val : arr) {
            if (!uniqueValues.add(val))
                duplicateValues.add(val);
        }

        System.out.println("Duplicate string is: " + duplicateValues);

        scanner.close();
    }
}
