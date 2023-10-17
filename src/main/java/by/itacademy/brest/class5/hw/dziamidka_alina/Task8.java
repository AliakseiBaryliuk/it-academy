package by.itacademy.brest.class5.hw.dziamidka_alina;

import java.util.Scanner;

public class Task8 {

    public static int isCorrect(int c, int d, int sum) {
        //see comments
        for (int i = 0; i < 3; i++) {
            if (c + d == sum) {
                return 1;
            } else {
                i++;
            }
        }
        return 2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        int a = scanner.nextInt();

        System.out.println("Введите число b: ");
        int b = scanner.nextInt();

        System.out.println("Введите ответ на вопрос: Сколько будет a + b: ");
        int answer = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            if (a + b != answer) {
                System.out.println("Попытайтесь снова");
                answer = scanner.nextInt();
            } else {
                break;
            }
        }

        switch (isCorrect(a, b, answer)) {
            case 1 -> System.out.println("Верно");
            case 2 -> System.out.println("Все, приплыли!");
        }
    }
}
/*
Great solution
But there are some moments:


    public static int isCorrect(int check, int answer) {
        if (check == answer) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        int a = scanner.nextInt();

        System.out.println("Введите число b: ");
        int b = scanner.nextInt();

        System.out.println("Введите ответ на вопрос: Сколько будет a + b: ");
        int check = a + b;
        int answer = scanner.nextInt();

        for (int i = 1; i < 3; i++) {
            if (check != answer) {
                System.out.println("Попытайтесь снова");
                answer = scanner.nextInt();
            } else {
                break;
            }
        }

        switch (isCorrect(check, answer)) {
            case 1 -> System.out.println("Верно");
            case 2 -> System.out.println("Все, приплыли!");
        }
    }
    you should find check var and use it;
 */
//score
//10