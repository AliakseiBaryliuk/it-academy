package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.io.IOException;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();
        //variable name with a small letter!!!
        double Result;
        if (operator == '+') {
            Result = number1 + number2;
            System.out.println(Result);
        } else if (operator == '-') {
            Result = number1 - number2;
            System.out.println(Result);
        } else if (operator == '*') {
            Result = number1 * number2;
            System.out.println(Result);
        } else if (operator == '/' && number2 == 0) {
            System.out.println("Ошибка.На 0 делить нельзя");
        } else if (operator == '/') {
            Result = number1 / number2;
            System.out.println(Result);
            //extra line to remove
        }
        //extra line to remove
    }
    //extra line to remove
}
//score
//8