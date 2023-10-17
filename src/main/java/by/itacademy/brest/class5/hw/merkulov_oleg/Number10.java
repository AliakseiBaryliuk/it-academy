package by.itacademy.brest.class5.hw.merkulov_oleg;

public class Number10 {
    public static void main(String[] args) {

        int[][] array = {
                {10, 16, 14},
                {5, 7, 3},
                {12, 9, 20}
        };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Максимальный элемент в массиве: " + max);
    }
}
//score
//10