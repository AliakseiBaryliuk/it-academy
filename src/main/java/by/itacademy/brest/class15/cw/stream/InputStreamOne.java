package by.itacademy.brest.class15.cw.stream;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputStreamOne {
    public static void main(String[] args) {
        Path path = Paths.get("./path.txt");
//        InputStream stream = InputStream.nullInputStream();
        InputStream stream = null;
        try {
            if (!Files.exists(path)){
                Files.createFile(path);
            }

            stream = initStream(path);
//            readFullyByByte(stream);
            readFullyByByteWithBuffer(stream);
//            readFullyByByteWithBuffer2(stream);
//            readAndWriteFullyByByteWithBuffer(stream, path);
//            Reader reader = initReader(path);
//            readFullyByByteWithBuffer2(reader);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    System.out.println("from close");
                }
            }
        }

// Another code
//        try {
//            Files.deleteIfExists(path);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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

    public static void readFullyByByteWithBuffer2(Reader stream) throws IOException {
        char[] buff = new char[5];

        while (true) {
            int read = stream.read(buff, 2, 3);
            if (read != -1) {
                System.out.println("str = " + new String(buff, 0, read + 2));
            } else {
                System.out.println("\nEnd");
                return;
            }
        }
    }

    public static void readAndWriteFullyByByteWithBuffer(InputStream stream, Path path) throws IOException {
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path.toString()));
        byte[] buff = new byte[1024];

        while (true) {
            int read = stream.read(buff);
            if (read != -1) {
                outputStream.write(buff, 0, read);
                outputStream.flush();
            } else {
                System.out.println("\nEnd");
                return;
            }
        }
    }

    public static void readFullyByByteWithBuffer(InputStream stream) throws IOException {
        InputStream buf = new BufferedInputStream(stream, 11);
        byte[] buff = new byte[5];

        while (true) {
            int read = buf.read(buff);
            if (read != -1) {
                System.out.println("str = " + new String(buff, 0, read));
            } else {
                System.out.println("\nEnd");
                return;
            }
        }
    }

    public static void readFullyByByteWithBuffer2(InputStream stream) throws IOException {
        byte[] buff = new byte[5];

        while (true) {
            int read = stream.read(buff, 2, 3);
            if (read != -1) {
                System.out.println("str = " + new String(buff, 0, read + 2));
            } else {
                System.out.println("\nEnd");
                return;
            }
        }
    }

    public static InputStream initStream(Path path) throws IOException {
        InputStream stream;
        stream = new FileInputStream(path.toFile());
//        stream = new URL("https://www.google.com/").openStream();
//        stream = new ByteArrayInputStream(new byte[]{65, 55});
        return stream;
    }

    public static Reader initReader(Path path) throws IOException {
        InputStream stream;
        stream = new FileInputStream(path.toFile());
        Reader reader = new InputStreamReader(stream);
        return reader;
    }

    public static void initBufReader(Path path){
        Reader buf = BufferedReader.nullReader();
        try {
            Reader reader = initReader(path);

            buf = new BufferedReader(reader);
            String line = getLine(buf);

            while (line != null) {
                System.out.println(line);
                line = getLine(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static String getLine(Reader buf) throws IOException {
        return ((BufferedReader)buf).readLine();
    }
}
