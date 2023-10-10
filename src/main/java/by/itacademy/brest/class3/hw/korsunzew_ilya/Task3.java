package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        // empty line for better readability
        System.out.println("последовательность чисел: " + a + " " + b + " " + c);
        // empty line for better readability
        if (a < b && a < c) {
            System.out.println(a + " " + b + " " + c);
        }
        if (b < c && b < a) {
            System.out.println(b + " " + c + " " + a);
        }
        if (c < a && c < b) {
            System.out.println(c + " " + a + " " + b);
        }
    }
}
//score
//9