package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Максимальный элемент: " + max);
    }
}
//score
//10
