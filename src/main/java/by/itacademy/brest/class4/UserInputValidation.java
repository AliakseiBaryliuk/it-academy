package by.itacademy.brest.class4;

import java.util.Scanner;

public class UserInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Please enter a number between 1 and 10: ");
            userChoice = scanner.nextInt();
        } while (userChoice < 1 || userChoice > 10);

        System.out.println("You entered a valid number: " + userChoice);
    }
}
