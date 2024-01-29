package inputoutput;

import java.io.File;

public class FileOrDirectory {
    public static void main(String[] args) {
        String path = "C:/Users/laak274414/OneDrive - Elektrobit/Pictures/Camera Roll";

        File fileOrDir = new File(path);

        if (fileOrDir.exists()) {
            if (fileOrDir.isFile()) {
                System.out.println(path + ": is a file");
            } else if (fileOrDir.isDirectory()) {
                System.out.println(path + ": is a directory");
            } else {
                System.out.println(path + " : exists but its neither file nor directory");
            }
        } else {
            System.out.println("File or directory doesn't exist: " + path);
        }
    }
}
