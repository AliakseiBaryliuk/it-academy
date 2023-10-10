package by.itacademy.brest.class3.hw.saiko_nikita;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        // empty line for better readability
        // use && instead of &
        if (year % 400 == 0 || year % 4 == 0 & year % 100 > 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}
//score
//9