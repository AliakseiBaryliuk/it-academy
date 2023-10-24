package by.itacademy.brest.readme.cw;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 50) {
                System.out.println("Больше");
            } else {
                System.out.println("Меньше");
            }
        }
    }
}
