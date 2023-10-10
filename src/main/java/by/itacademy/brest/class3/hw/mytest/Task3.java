package by.itacademy.brest.class3.hw.mytest;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int max = scanner.nextInt();
        int min = 0;

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        if (num2 > max){
            min = max;
            max = num2;
        }

        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        int middle;
        if (num3 < min){
            middle = min;
            min = num3;
        } else if (num3 > max){
            middle = max;
            max = num3;
        } else {
            middle = num3;
        }

        System.out.println(max + " " + middle + " " + min);
    }
}
