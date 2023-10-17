package by.itacademy.brest.class5.hw.merkulov_oleg;

import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int answer;
        int attempts = 3;

        System.out.print("Введите число a: ");
        a = scanner.nextInt();

        System.out.print("Введите число b: ");
        b = scanner.nextInt();

        System.out.print("Сколько будет a + b? ");
        answer = scanner.nextInt();

        while (attempts > 0) {
//does not work!

//            switch (answer) {
//                case a + b:
//                    System.out.println("Верно");
//                    return;
//
//                default:
//                    System.out.println("Попытайтесь снова");
//                    attempts--;
//
//                    if (attempts == 0) {
//                        System.out.println("Все приплыли!");
//
//                    } else {
//                        System.out.print("Сколько будет a + b? ");
//                        answer = scanner.nextInt();
//                    }
//                    break;
//            }
        }
    }
}
//score
//0