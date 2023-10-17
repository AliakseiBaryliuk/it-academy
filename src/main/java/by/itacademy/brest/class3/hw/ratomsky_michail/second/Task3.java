package by.itacademy.brest.class3.hw.ratomsky_michail.second;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        int a = numb.nextInt();
        int b = numb.nextInt();
        int c = numb.nextInt();

        int x = 0;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else if (b > c) {
            x = b;
            b = c;
            c = x;
        } else if (a > b) {
            x = a;
            a = b;
            b = x;
        }

        System.out.println("Убывающая последовательность:" + c + " " + b + " " + a);

    }
}
//check please input (3,2,1)
//score
//6
