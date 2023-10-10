package by.itacademy.brest.class3.hw.ratomsky_michail;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = scanner.nextInt();
        //usually the name isSomething is used for the boolean data type, in this case it is better to simply factorial
        int isFactorial = 1;

        for (int i = 1; i <= n; i++) {
            isFactorial *= i;
        }
        System.out.println(n + "! = " + isFactorial);
    }
}
//score
//9