package by.itacademy.brest.class4.cw;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String str = switch (a) {
            case 4, 6, 8 -> "<= 10";
            case 10, 12 -> ">= 10";
            case 100 -> {
                System.out.println("From yield");
                yield "Keyword yield";
            }
            default -> "Not appropriate";
        };
        System.out.println(str);
    }
}
