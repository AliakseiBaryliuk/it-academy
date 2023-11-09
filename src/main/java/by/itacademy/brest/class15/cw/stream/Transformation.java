package by.itacademy.brest.class15.cw.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Transformation {
    public static void main(String[] args) throws IOException {
        byte[] test = new byte[]{-128, -127, -126 ,-2, -1, 0, 1, 2, 3, 127};

        for (byte b: test) {
            InputStream stream = new ByteArrayInputStream(new byte[]{b});
            System.out.println("byte = " + b + "; int = " + stream.read());

        }
    }
}
