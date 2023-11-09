package by.itacademy.brest.class15.cw.stream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputStreamOne {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./path.txt");
        OutputStream stream = new FileOutputStream(path.toString());
        OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path.toString()));
        bufferedOutputStream.write(13);
        bufferedOutputStream.close();
        OutputStream arrayOutputStream = new ByteArrayOutputStream();

        stream.close();
    }
}
