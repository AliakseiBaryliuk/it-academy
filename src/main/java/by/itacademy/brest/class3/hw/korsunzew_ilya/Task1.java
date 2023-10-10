package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            //extra parentheses if (year % 100 != 0 || year % 400 == 0) remember priorities
            if ((year % 100 != 0) || (year % 400 == 0))
                System.out.println("год високосный");
        } else {
            System.out.println("год  не високосный");
        }
        //extra line to remove
    }
}
//score
//9