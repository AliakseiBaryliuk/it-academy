package by.itacademy.brest.class3.hw.ratomsky_michail;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();

        if (isPalindrome(a)) {
            System.out.println(a + " является палиндромом");
        } else {
            System.out.println(a + " не является палиндромом");
        }
    }
    // empty line for better readability
    public static boolean isPalindrome(int number) {

        String strNumber = String.valueOf(number);

        int length = strNumber.length();
        int lastIndex = length - 1;
        int firstIndex = 0;

        while (firstIndex < lastIndex) {
            if (strNumber.charAt(firstIndex) != strNumber.charAt(lastIndex)) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
//score
//9