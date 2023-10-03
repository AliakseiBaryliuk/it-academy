package by.itacademy.brest.class2.hw.dziamidka_alina;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите целое пятизначное число: ");
        int a = number.nextInt();
        // empty line for better readability
        if (a <= 99999 && a > 9999) {
            int num3 = a / 100 % 10;
            System.out.println("Третяя цифра числа " + a + " равна\n" + num3);
        } else System.out.println("Введено не пятизначное число");
    }
        /*
            You should always use curly braces to separate the body if-else:
            if (a <= 99999 && a > 9999) {
                int num3 = a / 100 % 10;
                System.out.println("Третяя цифра числа " + a + " равна\n" + num3);
            } else {
                System.out.println("Введено не пятизначное число");
            }
        */
}
//plus for working on the extreme case of a five-digit number! Good job!
//score
//9
