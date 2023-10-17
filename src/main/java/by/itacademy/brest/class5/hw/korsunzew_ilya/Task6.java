package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру с консоли: ");
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            int[] array = new int[userInput];

            Random random = new Random();
            for (int i = 0; i < userInput; i++) {
                if (i % 2 == 0) {
                    //just number System.out.print("Введите число: ");
                    System.out.print("Введите чётное число: ");
                    array[i] = scanner.nextInt();
                } else {
                    array[i] = random.nextInt(101);
                }
            }

            int min = array[0];
            for (int i = 1; i < userInput; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Минимальное число в массиве: " + min);
        } else {
            System.out.println("Невозможно создать массив");
        }
    }
}
//score
//9