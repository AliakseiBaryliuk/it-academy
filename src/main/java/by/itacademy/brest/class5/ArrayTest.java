package by.itacademy.brest.class5;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Arrays.fill(arr, 4);
        for (int el : arr){
            System.out.println(el);
        }

        int[] copy = Arrays.copyOf(arr, 20);
        for (int el : copy){
            System.out.println(el);
        }
        System.out.println(copy.length);
        System.out.println();

        Random random = new Random();
        for (int i = 0; i < copy.length; i++) {
            random.setSeed(i);
            copy[i] = random.nextInt(50);
            System.out.println(copy[i]);
        }

        System.out.println("---------------------");

        Arrays.sort(copy);
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

        int binarySearch = Arrays.binarySearch(copy, 14);
        System.out.println();
        System.out.println(binarySearch);
    }
}
