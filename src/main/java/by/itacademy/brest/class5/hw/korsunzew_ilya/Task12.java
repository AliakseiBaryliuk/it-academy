package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        int sum = 0;
        //empty line for better readability
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
            sum += array[i];
        }
        //empty line for better readability
        if (sum < 50) {
            System.out.println("Сумма меньше 50");
        } else if (sum > 50) {
            System.out.println("Сумма больше 50");
        } else {
            System.out.println("Сумма равна 50");
        }
    }
}
//score
//9