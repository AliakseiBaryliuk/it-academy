package by.itacademy.brest.class3.hw.ratomsky_michail.second;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println("Ответ: " + a + "!= " + result);

    }
}
//score
//10






