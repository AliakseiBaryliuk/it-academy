package by.itacademy.brest.class2.hw.dziamidka_alina;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите число: ");
        double number = a.nextDouble();
        // empty line for better readability
        //it is enough to define one Scanner instance!!!
//        Scanner b = new Scanner(System.in);
        System.out.print("Введите число 1, если хотите перевести C в F или введите число 2, если хотите перевести F в C: ");
        int number1 = a.nextInt();
        // empty line for better readability
        if (number1 == 1) {
            double F1 = ((number * 9 / 5) + 32);
            System.out.println(number + "C" + " равно " + F1 + "F");
        } else if (number1 == 2) {
            double C1 = ((number - 32) * 5) / 9;
            System.out.println(number + "F" + " равно " + C1 + "C");
        } else System.out.println("введено неверное число");
    }
}
//curly braces in if-else!!!
//score
//8
