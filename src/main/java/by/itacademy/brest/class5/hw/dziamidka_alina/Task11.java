package by.itacademy.brest.class5.hw.dziamidka_alina;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    //This method doesn't check for validity, it checks to see if the first value is greater than the second.
    //isGreaterThan
    /*
        public static boolean isGreaterThan(int n, int a) {
        return n > a;
    }
     */
    public static boolean isCorrect(int n, int a) {
        if (n > a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int num = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Угадайте загаданное число: ");
        int answer = scanner.nextInt();

        /*
           while (num != answer) {
            if (isCorrect(num, answer)) {
                System.out.println("Больше");
            } else {
                System.out.println("Меньше");
            }
            answer = scanner.nextInt();
        }
         */
        while (num != answer) {
            if (isCorrect(num, answer)) {
                System.out.println("Больше");
                answer = scanner.nextInt();
            } else {
                System.out.println("Меньше");
                answer = scanner.nextInt();
            }
        }
        System.out.println("Верно");
    }
}
//score
//8