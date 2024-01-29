package inputoutput;

import java.io.File;
import java.util.Arrays;

public class FilesExtensions {
    public static void main(String[] args) {
        String folderPath = "C:/Users/laak274414/OneDrive - Elektrobit/Pictures/Camera Roll";

        String extension = ".png";

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles((dir, name) -> name.endsWith(extension));

            if (files != null && files.length > 0) {
                System.out.println("Files wirh extension '" + extension + "' in " + folderPath + ":");
                Arrays.stream(files).map(File::getName).forEach(System.out::println);
            } else {
                System.out.println("No files are there with " + extension + " extension.");
            }
        } else {
            System.out.println("Invalid folder path: " + folderPath);
        }
    }
}
