package by.itacademy.brest.class3.hw.merkulov_oleg;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int numb = scanner.nextInt();
        int a;
        int b = 0;
        int temp;

        temp = numb;

        while (numb != 0) {
            a = numb % 10;
            b = b * 10 + a;
            numb = numb / 10;
        }

        //You should use curly brackets!
        if (temp == b)
            System.out.println(temp + " Palindrome.");

        else
            System.out.println(temp + " not a palindrome.");
    }
}
//score
//8
