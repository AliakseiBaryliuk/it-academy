package by.itacademy.brest.class3.hw.merkulov_oleg;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        //You can combine multiple conditions
        if (year % 400 == 0) {
            System.out.println("Leap Year");

        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");

        } else if (year % 4 == 0) {
            System.out.println("Leap Year");

        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
//score
//9
