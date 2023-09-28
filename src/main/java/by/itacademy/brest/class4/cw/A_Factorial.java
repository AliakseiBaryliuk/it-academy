package by.itacademy.brest.class4.cw;

import java.util.Scanner;

public class A_Factorial {
    public static void main(String[] args) {
        /*
        Факториал числа:
        Напишите программу, которая вычисляет факториал заданного числа.
        Факториал числа n обозначается как n! и равен произведению всех положительных целых чисел от 1 до n.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал " + n + " равен " + factorial);
    }
}
