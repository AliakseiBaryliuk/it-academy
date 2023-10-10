package by.itacademy.brest.class3.hw.saiko_nikita;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        //initialize values in different lines - it’s clearer this way
        /*
        int rem = 0;
        int rev = 0;
        int temp = 0;
         */
        int rem, rev = 0, temp;
        temp = num;
        // empty line for better readability
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        // empty line for better readability
        if (temp == rev)
            System.out.println(temp + " является палиндромом.");
        else
            System.out.println(temp + " не является палиндромом.");
    }
}
//score
//8