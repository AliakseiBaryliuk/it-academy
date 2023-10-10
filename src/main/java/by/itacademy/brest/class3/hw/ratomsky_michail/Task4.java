package by.itacademy.brest.class3.hw.ratomsky_michail;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = (num1 + num2);
                break;
            case '-':
                result = (num1 - num2);
            case '/':
                result = (num1 / num2);
                if (num2 == 0) {
                System.out.println("Ошибка, на ноль делить нельзя");
                }
            case '*':
                result = (num1 * num2);
            System.out.println(result);


        }


    }
}
// did you check your code?