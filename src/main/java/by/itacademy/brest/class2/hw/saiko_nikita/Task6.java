package by.itacademy.brest.class2.hw.saiko_nikita;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Найти среднее арифметическое цифр числа (input: 123, output: 2)
        //In this task the original number is "int source = 123;"(input: 123) from which you need to get 3 separate numbers 1,2,3
        Scanner sc = new Scanner(System.in);
        //empty line for better readability
        System.out.println("Введите цифру:");
        int a = sc.nextInt();
        System.out.println("Введите цифру:");
        int b = sc.nextInt();
        System.out.println("Введите цифру:");
        int c = sc.nextInt();
        //empty line for better readability
        double num = (a + b + c) / 3;
        //empty line for better readability
        System.out.println("Среднее арифметическое число: " + num);
        //extra 2 empty lines

    }
}
//score
//7