package by.itacademy.brest.class4.cw;

import java.util.Scanner;

public class ReviewOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int sourceNumber = scanner.nextInt();

        // Найти число состоящее из первых трех цифер
        int i = sourceNumber / 100;

        // найти сумму всех чисел этого числа
//        int a = i % 10;
//        i /= 10;
//        int b = i % 10;
//        i /= 10;
//        int c = i % 10;

        int sum1 = 0;
        for (int j = 0; j < 3; j++) {
            sum1 += i % 10;
            i /= 10;
        }
//        int sum = a + b + c;
        // (switch) если это число 4 вывести "4", если 5 то "5" default "Not appropriate"
        switch (sum1) {
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> System.out.println("Not appropriate");
        }
        /*
        вычесть sum из sourceNumber и если остаток от деления на 100 больше 10,
        то выводим "Remainder > 10" иначе "Remainder < 10"
        */

        i = sourceNumber - sum1;
        int i1 = i % 100;

        if (i1 > 10) {
            System.out.println("Remainder > 10");
        } else {
            System.out.println("Remainder < 10");
        }
    }
}
