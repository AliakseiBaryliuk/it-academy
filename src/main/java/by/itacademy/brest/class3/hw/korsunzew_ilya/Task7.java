package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Число " + originalNumber + " является палиндромом.");
        } else {
            System.out.println("Число " + originalNumber + " не является палиндромом.");
        }
    }
}
//score
//10
