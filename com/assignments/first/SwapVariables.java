package first;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers (a & b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping- a: " + a + ", b: " + b);

        scanner.close();
    }
}
