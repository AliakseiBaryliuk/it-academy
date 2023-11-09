package by.itacademy.brest.class15.cw;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {
    public static void main(String[] args) {
        testIO();
        testNIO();
    }

    private static void testIO() {
        // Specify the path to a file or directory
        String filePath = "C:\\example\\example.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file or directory exists
        if (file.exists()) {
            System.out.println("File or directory exists!");

            // Get file information
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");

            // Check if it's a directory
            if (file.isDirectory()) {
                System.out.println("It's a directory.");
            } else {
                System.out.println("It's a file.");
            }
        } else {
            System.out.println("File or directory does not exist.");

            // Create a new file
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully!");
                } else {
                    System.out.println("Failed to create the file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void testNIO() {
        // Specify the path to a file or directory
        String filePath = "C:\\example\\example.txt";
        Path path = Paths.get(filePath);

        // Check if the file or directory exists
        if (Files.exists(path)) {
            System.out.println("File or directory exists!");

            // Get file information
            System.out.println("File name: " + path.getFileName());
            System.out.println("Absolute path: " + path.toAbsolutePath());
            try {
                System.out.println("Size: " + Files.size(path) + " bytes");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Check if it's a directory
            if (Files.isDirectory(path)) {
                System.out.println("It's a directory.");
            } else {
                System.out.println("It's a file.");
            }
        } else {
            System.out.println("File or directory does not exist.");

            // Create a new file
            try {
                Files.createFile(path);
                System.out.println("File created successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
The choice between java.io and java.nio.file depends on your specific use case and the Java version you are using.

java.io (File class): This is the older I/O API and is simpler to use. It's suitable for basic file operations,
but it can be less efficient for handling large files or working with a large number of files.

java.nio.file: This is the newer NIO (New I/O) API introduced in Java 7. It provides more features,
better performance, and improved scalability. It's especially useful for working with large files,
asynchronous I/O, and handling complex file system operations.

If you are working with Java 7 or later, and your application involves more advanced file operations,
it's generally recommended to use the java.nio.file package. It provides a more comprehensive and flexible set of tools for file I/O.

In summary, if you're working on a new project with Java 7 or later, consider using java.nio.file.
If you're maintaining an older project or have simpler file I/O needs, java.io might be sufficient.
 */