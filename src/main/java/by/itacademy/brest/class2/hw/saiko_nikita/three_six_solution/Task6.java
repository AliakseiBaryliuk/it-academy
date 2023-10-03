package by.itacademy.brest.class2.hw.saiko_nikita.three_six_solution;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //empty line for better readability
        System.out.println("Введите трёхзначное число:");
        int num = sc.nextInt();
        //empty line for better readability
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        //empty line for better readability
        double num2 = (a + b + c) / 3;
        //empty line for better readability
        System.out.println("Среднее арифметическое число: " + num2);
    }
}
//score
//9

