package by.itacademy.brest.class3.hw.saiko_nikita;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();
        // sum - strange name!!!)
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println("Факториал числа " + num + " будет " + sum);
    }
}
//score
//8