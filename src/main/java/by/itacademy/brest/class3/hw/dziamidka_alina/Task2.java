package by.itacademy.brest.class3.hw.dziamidka_alina;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/' && num2 == 0) {
            System.out.print("Ошибка. На 0 делить нельзя");
            return;
        } else if (operator == '/') {
            result = num1 / num2;
        }
        System.out.print(result);
    }
}
/*
Additionally, you can use while so that the program does not end after one action, but ends after a certain command
 */
//score
//10