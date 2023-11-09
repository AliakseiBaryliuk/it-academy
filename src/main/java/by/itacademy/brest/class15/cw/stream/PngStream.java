package by.itacademy.brest.class15.cw.stream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PngStream {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("java.png");
        InputStream inputStream = new BufferedInputStream(new FileInputStream(path.toString()));
//        readFullyByByte(inputStream);
        Path out = Paths.get("java1.png");
        readAndWriteFullyByByteWithBuffer(inputStream, out);
    }

    public static void readFullyByByte(InputStream stream) throws IOException {
        int count = 1;

        while (true) {
            int read = stream.read();
            if (read != -1) {
                System.out.println("Try = " + count++ + "; char = " + (char) read);
            } else {
                System.out.println("\nEnd");
                return;
            }
        }
    }

    public static void readAndWriteFullyByByteWithBuffer(InputStream in, Path path) throws IOException {
        OutputStream outputStream = OutputStream.nullOutputStream();
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(path.toString()));
//            byte[] buffer = new byte[8192];
            int inr;
            while ((inr = in.read()) != -1) {
                outputStream.write(inr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }

    }
}
