package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        System.out.println("Сколько будет a + b?");

        while (attempts > 0) {
            System.out.print("Введите ваш ответ: ");
            int answer = scanner.nextInt();

            if (answer == (a + b)) {
                System.out.println("Верно!");
                break;
            } else {
                attempts--;
                //move this line to if
                System.out.println("Попытайтесь снова.");
                if (attempts > 0) {
                    //System.out.println("Попытайтесь снова.");
                    System.out.println("У вас осталось " + attempts + " попытки(ок).");
                } else {
                    System.out.println("Все приплыли!");
                }
            }
        }
    }
}
//score
//9
