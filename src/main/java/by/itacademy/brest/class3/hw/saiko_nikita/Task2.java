package by.itacademy.brest.class3.hw.saiko_nikita;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //extra line to remove
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.print(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (num1 == 0 || num2 == 0) {
            System.out.println("Введите другие числа!");
        } else if (operator == '/') {
            System.out.print(num1 / num2);
        }

        //extra line to remove
    }
}
//score
//9