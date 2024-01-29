package inputoutput;

import java.io.File;

public class ReadOrWrite {
    public static void main(String[] args) {
        String path = "C:/Users/laak274414/OneDrive - Elektrobit/Pictures/Camera Roll";

        File fileOrDir = new File(path);

        if (fileOrDir.exists()) {
            if (fileOrDir.canRead()) {
                System.out.println("Read permissions are granted for: " + path);
            } else {
                System.out.println("Read permissions are not granted for: " + path);
            }

            if (fileOrDir.canWrite()) {
                System.out.println("Write permissions are granted for: " + path);
            } else {
                System.out.println("Write permissions are not granted for: " + path);
            }

        } else {
            System.out.println("File or directory doesn't exist: " + path);
        }
    }
}
