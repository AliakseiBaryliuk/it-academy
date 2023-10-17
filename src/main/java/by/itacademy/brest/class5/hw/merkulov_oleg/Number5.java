package by.itacademy.brest.class5.hw.merkulov_oleg;

import java.util.Random;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");

        int result = 0;
        int[] arr = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        // you can use one "for" to find max and min
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                result = max - min;
            }
        }
        System.out.println(result);
    }
}
//score
//8