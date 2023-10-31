package by.itacademy.brest.class10.cw.result;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        final int MAX_SIZE = 10;

        String[] strings = new String[MAX_SIZE];
        int currentIndex = 0;

        String inputString;
        Scanner scanner = new Scanner(System.in);

        while (currentIndex < MAX_SIZE) {
            inputString = scanner.nextLine();

            if (inputString.equals("стоп")) {
                break;
            }
            strings[currentIndex] = inputString;
            currentIndex++;
        }
        for (int i = 0; i < currentIndex; i++) {
            String currentString = strings[i];

            switch (currentString) {
                case "а":
                    for (int j = 0; j < 10; j++) {
                        System.out.println(currentString);
                    }
                    break;
                case "б":
                    for (int j = 0; j < 5; j++) {
                        System.out.println("а");
                    }
                    break;
                default:
                    System.out.println("Default");
            }
        }
        scanner.close();
    }
}