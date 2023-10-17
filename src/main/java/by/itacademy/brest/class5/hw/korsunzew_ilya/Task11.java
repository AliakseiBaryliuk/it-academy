package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
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
}
//score
//9
