package by.itacademy.brest.class3.hw.saiko_nikita;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = sc.nextInt();
        // empty line for better readability
        switch (month) {
            case 1:
                System.out.println("В январе 31 день");
                break;
            case 2:
                System.out.print("Введите год: ");
                int year = sc.nextInt();
                // use && instead of &
                if (year % 400 == 0 || year % 4 == 0 & year % 100 > 0) {
                    System.out.println("В феврале 29 дней");
                } else {
                    System.out.println("В феврале 28 дней");
                }
                break;
            case 3:
                System.out.println("В марте 31 день");
                break;
            case 4:
                System.out.println("В апреле 30 дней");
                break;
            case 5:
                System.out.println("В майе 31 день ");
                break;
            case 6:
                System.out.println("В июне 30 дней");
                break;
            case 7:
                System.out.println("В июле 31 день");
                break;
            case 8:
                System.out.println("В августе 31 день");
                break;
            case 9:
                System.out.println("В сентябре 30 дней");
                break;
            case 10:
                System.out.println("В октябре 31 день");
                break;
            case 11:
                System.out.println("В ноябре 30 дней");
                break;
            case 12:
                System.out.println("В декабре 31 день");
                break;
        }
    }
}
//try to use new switch with case 3,5... ->
//score
//8