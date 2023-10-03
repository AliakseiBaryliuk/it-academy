package by.itacademy.brest.class2.hw.saiko_nikita;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Напишите программу, которая проверяет, является ли введенное число четным или нечетным
        Scanner sc = new Scanner(System.in);
        //empty line for better readability
        System.out.println("Введите  число:");
        int num = sc.nextInt();
        //empty line for better readability
        //You should always use curly braces to separate the body if-else:
        if (num % 2 == 0)
            System.out.println("Введённое число чётное");
        else
            System.out.println("Введённое число не чётное");
    }
}
//score
//9