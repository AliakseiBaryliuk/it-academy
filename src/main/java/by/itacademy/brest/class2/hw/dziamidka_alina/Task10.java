package by.itacademy.brest.class2.hw.dziamidka_alina;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        // empty line for better readability
        if (Palindrome(number)) {
            System.out.println(number + " является палиндромом");
        } else {
            System.out.println(number + " не является палиндромом.");
        }
    }
    //method always starts with a lowercase letter!!!
    public static boolean Palindrome(int testNum) {
        //variable always starts with a lowercase letter!!!
        String StrTestNum = String.valueOf(testNum);
        int length = StrTestNum.length();
        //variable always starts with a lowercase letter!!!
        char[] AllNumbers = StrTestNum.toCharArray();
        //usually written length - 1, it's more obvious
        int lastIndex = --length;
        int firstIndex = 0;
        // empty line for better readability
        char firstTestNum = AllNumbers[firstIndex];
        char lastTestNum = AllNumbers[lastIndex];
        // empty line for better readability
        while (firstIndex < lastIndex) {
            if (firstTestNum != lastTestNum) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
//score
//8

