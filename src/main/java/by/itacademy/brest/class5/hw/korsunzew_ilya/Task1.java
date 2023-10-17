package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int resault = 0;
        do {

            System.out.print("введите число");
            number = scanner.nextInt();
            if (number % 3 == 0) {
                resault += number;
            }
        } while (number != 0);

        int sum = 0;

        while (resault != 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println(sum);

    }
}