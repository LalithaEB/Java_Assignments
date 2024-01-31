package first;

//Java program to print the ASCII value of a given character

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");

        char c = scanner.next().charAt(0);

        int asciiValue = (int) c;

        System.out.println("ASCII value of character- " + c + " is: " + asciiValue);
        scanner.close();
    }
}
