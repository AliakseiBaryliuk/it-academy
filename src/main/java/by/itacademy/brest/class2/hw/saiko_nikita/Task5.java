package by.itacademy.brest.class2.hw.saiko_nikita;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Проверка на четность последней цифры: (input: 1235, output: false), (input: 12358, output: true)
        Scanner sc = new Scanner(System.in);
        // empty line for better readability
        System.out.println("Введите  число:");
        int num = sc.nextInt();
        // empty line for better readability
        int a = num % 10;
        // empty line for better readability
        //You should always use curly braces to separate the body if-else:
        if (a % 2 == 0)
            System.out.println("Последняя цифра числа четная:");
        else
            System.out.println("Последняя цифра числа не четная:");
        System.out.println(a);
    }
}
//score
//9