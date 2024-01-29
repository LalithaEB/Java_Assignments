package inputoutput;

import java.io.File;
import java.util.Arrays;

public class ListNames {
    public static void main(String[] args) {
        String dirPath = "C:/Users/laak274414/OneDrive - Elektrobit/Pictures/Camera Roll";

        File dir = new File(dirPath);

        if (dir.exists() && dir.isDirectory()) {
            String[] filesList = dir.list();

            if (filesList != null) {
                System.out.println("Files and directories in " + dirPath + ": ");
                Arrays.stream(filesList).forEach(System.out::println);
            } else {
                System.out.println("No such files or directories found in " + dirPath);
            }
        } else {
            System.out.println("Invalid directory path: " + dirPath);
        }
    }
}
