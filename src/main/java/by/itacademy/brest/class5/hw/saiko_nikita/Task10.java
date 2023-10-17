package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Arr = new int[5][5];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                Arr[i][j] = random.nextInt(100);
            }
        }
        //empty line for better readability
        int max = 0;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                if (max < Arr[i][j]) {
                    max = Arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
//score
//9