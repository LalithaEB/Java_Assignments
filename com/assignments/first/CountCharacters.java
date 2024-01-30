package first;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String str = scanner.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int digitCount = 0;
        int otherCharCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c))
                letterCount++;
            else if (Character.isWhitespace(c))
                spaceCount++;
            else if (Character.isDigit(c))
                digitCount++;
            else
                otherCharCount++;
        }

        System.out.println("Number of letters: " + letterCount + "\nNumber os spaces: " + spaceCount
                + "\nNumber of digits: " + digitCount + "\nNumber of other characters: " + otherCharCount);

        scanner.close();
    }
}
