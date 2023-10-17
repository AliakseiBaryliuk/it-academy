package by.itacademy.brest.class5.hw.merkulov_oleg;

import java.util.Random;
import java.util.Scanner;


public class Number12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();
        //If you are copying some code, you should remove comments because they pollute your code.
        // Заполнение массива рандомными значениями
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101); // Генерируем числа от 0 до 100
        }

        // Вычисление суммы
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Вывод результата
        if (sum < 50) {
            System.out.println("Сумма меньше 50 равна " + sum);
        } else if (sum > 50) {
            System.out.println("Сумма больше 50 равна " + sum);
        } else {
            System.out.println("Сумма равна 50 равна " + sum);
        }
    }
}
//score
//8