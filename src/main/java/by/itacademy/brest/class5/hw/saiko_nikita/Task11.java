package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число до которого хотите играть: ");
        int x = sc.nextInt();
        int a = random.nextInt(x - 1);

        if (a % 2 == 0) {
            System.out.println("Число четное");
            System.out.println("Число между " + (a - 3) + " и " + (a + 3));
        }
        if (a % 2 != 0) {
            System.out.println("Число нечетное");
            System.out.println("Число между " + (a - 3) + " и " + (a + 3));
        }

        while (true) {
            System.out.print("Введите число: ");
            int num = sc.nextInt();

            if (a == num) {
                System.out.println("Угадали");
                break;
            } else System.out.println("Неверно");
        }
    }
}
//Not exactly what I had in mind, but it'll do
/*
korsunzew_ilya solution:

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        System.out.println("Угадайте число от 1 до 100.");
        //empty line for better readability
        while (true) {
            System.out.print("Введите ваше предположение: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        }
    }
 */
//score
//8