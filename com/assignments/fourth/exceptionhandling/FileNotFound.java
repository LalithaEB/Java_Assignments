package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            checkFileExists("e.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Catch block");
            System.out.println(e.getMessage());
        }
    }

    private static void checkFileExists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + file);
        }
    }
}
