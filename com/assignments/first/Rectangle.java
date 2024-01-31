package first;

//Java program to print the area and perimeter of a rectangle. (use user input)

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        System.out.println("Area of rectangle: " + length * breadth);
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
        scanner.close();
    }
}
