package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("вессти масив");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        //use "for" for max and min
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int diff = max - min;

        System.out.println("Массив: " + Arrays.toString(array));
        //we should print just max - min
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Разница: " + diff);
    }
}
//score
//6