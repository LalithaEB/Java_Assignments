package inputoutput;

import java.io.File;

public class CheckExsistence {
    public static void main(String[] args) {
        String path = "C:/Users/laak274414/OneDrive - Elektrobit/Pictures/Camera Roll";

        File fileOrDir = new File(path);

        if (fileOrDir.exists()) {
            System.out.println("File or directory exists" + path);

            if (fileOrDir.isFile())
                System.out.println("It's a file");
            if (fileOrDir.isDirectory())
                System.out.println("It's a directory");
        } else {
            System.out.println("File or directory doesn't exist." + path);
        }
    }
}
