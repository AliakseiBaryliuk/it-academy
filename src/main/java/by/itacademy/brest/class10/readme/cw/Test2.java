package by.itacademy.brest.class10.readme.cw;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];
        int i = 0;

        while (true) {
            String line = scanner.nextLine();
            if (i >= strings.length || line.equals("стоп")) {
                break;
            }
            strings[i] = line;
            i++;
        }

        for (int j = 0; j < strings.length; j++) {
            switch (strings[j]) {
                case "а" -> {
                    for (int k = 0; k < 10; k++) {
                        System.out.println("это а");
                    }
                }
                case "б" -> {
                    for (int k = 0; k < 5; k++) {
                        System.out.println("это б");
                    }
                }
                default -> System.out.println("default");
            }

        }
    }
}
