package by.itacademy.brest.class3.hw.dziamidka_alina;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядкой номер месяца от 1 до 12: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear;
        int days = 0;

        String[] array = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (year % 400 == 0) {
            isLeapYear = false;
        } else if (year % 100 == 0) {
            isLeapYear = true;
        }
        /* Simplify the part below as
        else {
            isLeapYear = year % 4 != 0;
        }
         */
        else if (year % 4 == 0) {
            isLeapYear = false;
        } else {
            isLeapYear = true;
        }

        switch (month) {
            // In this case, with a one-line solution, curly braces are not needed
            case 1, 3, 5, 7, 8, 10, 12 -> {
                days = 31;
            }
            case 4, 6, 9, 11 -> {
                days = 30;
            }
            case 2 -> {
                if (isLeapYear) {
                    days = 28;
                } else {
                    days = 29;
                }
            }
        }
        System.out.println("In " + array[month - 1] + " " + year + " " + days + " days");
    }
}
//score
//9