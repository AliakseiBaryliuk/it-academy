package by.itacademy.brest.class3.hw;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " является палиндромом.");
        } else {
            System.out.println(number + " не является палиндромом.");
        }
    }

    //
//    public static boolean isPalindrome(int number) {
//        int originalNumber = number;
//        int reversedNumber = 0;
//
//        while (number != 0) {
//            int remainder = number % 10;
//            reversedNumber = reversedNumber * 10 + remainder;
//            number /= 10;
//        }
//
//        return originalNumber == reversedNumber;
//    }
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Отрицательные числа не могут быть палиндромами
        }

        int reversedNumber = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
        }

        return number == reversedNumber;
    }
}
