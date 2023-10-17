package by.itacademy.brest.class3.hw.ratomsky_michail.second;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //these brackets are redundant
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = scanner.nextInt();

            int reverseNum = 0, initialNum, remainder = 0;
            initialNum = num;
            for (; num != 0; num /= 10) {
                remainder = num % 10;
                reverseNum = (reverseNum * 10) + remainder;
            }

            if (initialNum == reverseNum) {
                System.out.println("Да, число " + initialNum + " Палиндром");
            } else {
                System.out.println("Число " + initialNum + " Не Палиндром");
            }
        }
    }
    //extra empty line
}
//score
//8


