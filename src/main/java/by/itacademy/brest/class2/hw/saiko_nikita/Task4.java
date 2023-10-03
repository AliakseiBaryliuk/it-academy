package by.itacademy.brest.class2.hw.saiko_nikita;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Вывести 3юю цифру 5ти-значного числа
        Scanner sc = new Scanner(System.in);
        // empty line for better readability
        System.out.println("Введите пятизначное число:");
        int num = sc.nextInt();
        // empty line for better readability
        int a = num / 100 % 10;
        // empty line for better readability
        System.out.println("3-я цифра 5-ти значного числа:");
        System.out.println(a);
        //extra 2 empty lines

    }
}
//score
//9
