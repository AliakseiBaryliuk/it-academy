package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        int arrsize = sc.nextInt();
        int[] Arr = new int[arrsize];
        Random random = new Random();
        //empty line for better readability
        for (int i = 0; i < arrsize; i++) {
            Arr[i] = random.nextInt(10);
        }
        //empty line for better readability
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            sum += Arr[i];
        }
        //empty line for better readability
        if (sum < 50) {
            System.out.println("Сумма меньше 50");
        }
        //empty line for better readability
        if (sum > 50) {
            System.out.println("Сумма больше 50");
        }
        // if equals? and use if-else
    }
}
//score
//6