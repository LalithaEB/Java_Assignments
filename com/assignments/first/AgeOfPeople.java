package first;

import java.util.Scanner;

public class AgeOfPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age of 3 people: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maxAge = Math.max(a, Math.max(b, c));
        int minAge = Math.min(a, Math.min(b, c));

        System.out.println("Eldest is- " + maxAge);
        System.out.println("Youngest is- " + minAge);
        scanner.close();
    }
}
