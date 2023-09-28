package by.itacademy.brest.class3.hw;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Факториал не определен для отрицательных чисел.");
        } else {
            long factorial = 1; // Используем long, чтобы обойти ограничения на хранение больших значений
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + n + " равен " + factorial);
        }
    }
}
