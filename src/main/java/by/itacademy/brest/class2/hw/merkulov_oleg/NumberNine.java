package by.itacademy.brest.class2.hw.merkulov_oleg;

import java.util.Scanner;

public class NumberNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        // empty line for better readability
        if (number % 2 == 0) {
            System.out.println("number " + number + " is even.");
        } else {
            System.out.println("number " + number + " is not even.");
        }
    }
}
//score
//9