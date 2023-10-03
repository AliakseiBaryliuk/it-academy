package by.itacademy.brest.class2.hw.dziamidka_alina;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите целое число: ");
        int a = number.nextInt();
        // empty line for better readability
        String even = "введенное число является четным";
        String odd = "введенное число является нечетным";
        String b = (a % 2 == 0) ? even : odd;
        // empty line for better readability
        System.out.println(b);
    }
}
//score
//9