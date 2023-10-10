package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        // empty line for better readability
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // what about / 0?
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Некорректный оператор.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
/*use new syntax
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' ->
                // what about / 0?
                    result = num1 / num2;
            default -> {
                System.out.println("Ошибка! Некорректный оператор.");
                return;
            }
 */
//score
//7