package by.itacademy.brest.class2.hw.saiko_nikita;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Определить, является ли число простым
        int num;
        Scanner sc = new Scanner(System.in);
        //empty line for better readability
        System.out.println("Введите  число");
        num = sc.nextInt();
        //empty line for better readability
        for (int i = (int) Math.sqrt(num); i >= 1; i--) {
            //use && instead
            if (num % i == 0 & i != 1) {
                System.out.println("Число  составное");
                break;
            }
            //You should always use curly braces to separate the body if-else:
            if (i == 1) System.out.println("Число простое");
        }
    }
}
//score
//9