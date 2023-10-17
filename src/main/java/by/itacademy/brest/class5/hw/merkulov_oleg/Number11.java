package by.itacademy.brest.class5.hw.merkulov_oleg;

import java.util.Random;
import java.util.Scanner;

public class Number11 {
    public static void main(String[] args) {
        Random random = new Random();
        int numToPlayer = random.nextInt(100) + 1;
        int player;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Угадайте число от 1 до 100: ");
            player = scanner.nextInt();

            if (player == numToPlayer) {
                System.out.println("Поздравляю! Вы угадали число.");
                break;
            } else if (player < numToPlayer) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        }
        scanner.close();
    }
}
//score
//10
