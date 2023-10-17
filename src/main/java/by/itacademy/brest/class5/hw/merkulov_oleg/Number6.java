package by.itacademy.brest.class5.hw.merkulov_oleg;

import java.util.Scanner;
import java.util.Random;

public class Number6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер не равный 0 :");

        int numb = scanner.nextInt();

        if (numb > 0) {
            int[] array = new int[numb];

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    array[i] = random.nextInt();
                } else {
                    System.out.println("Введите число для четного массива " + i + ":");
                    array[i] = scanner.nextInt();
                }
            }

            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Минимальное число: " + min);
        } else {
            System.out.println("Невозможно создать массив");
        }
    }
}
//score
//10