package th;

import java.io.File;

public class FileUtil {

    // This method calculates the total size of a file or folder
    public long calculateSize(File file) {
        long size = 0;

        // If it's a file, return its length
        if (file.isFile()) {
            size = file.length();
        }
        // If it's a directory, calculate the size of all files within it
        else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    size += calculateSize(f); // Recursively calculate size for each file/folder
                }
            }
        }
        return size;
    }
}
