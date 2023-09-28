package by.itacademy.brest.class4.cw;

import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму денег в рублях: ");
        int amount = scanner.nextInt();

        int lastTwoDigits = amount % 100;

        String currency;
        /*
            1 рубль (например, 1, 21, 31, 101)
            2 рубля (например,    2,   3,   4,
                                 22,  23,  24,
                                102, 103, 104)
            5 рублей (например,
             - 5, 6, 7, 8, 9, 0
             - 10, 11, 12, 13, 14,
             - 15, 16, 17, 18, 19, 20,
             - 25, 26, 27, 28, 29, 30,
             - 35, 36, 37, 38, 39, 40)
         */
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            currency = "рублей";
        } else {
            int lastDigit = lastTwoDigits % 10;
            if (lastDigit == 1) {
                currency = "рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                currency = "рубля";
            } else {
                currency = "рублей";
            }
        }

        System.out.println("Сумма денег: " + amount + " " + currency);
    }
}
