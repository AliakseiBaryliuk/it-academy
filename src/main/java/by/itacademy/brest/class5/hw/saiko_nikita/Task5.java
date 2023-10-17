package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        //camel case arrSize
        int arrsize = sc.nextInt();
        //lower case for variables
        int[] Arr = new int[arrsize];
        Random random = new Random();
        //empty line for better readability
        for (int i = 0; i < arrsize; i++) {
            //put 100 in a separate variable (int bound = 100;) and use it on a line 28 int min = bound;
            Arr[i] = random.nextInt(100);
        }
        //empty line for better readability
        int max = 0;
        for (int i = 0; i < arrsize; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
        }
        //empty line for better readability
        int min = 100;
        for (int i = 0; i < arrsize; i++) {
            if (min > Arr[i]) {
                min = Arr[i];
            }
        }
        System.out.println("The difference between the maximum and minimum values: "+ (max-min));
    }
}
//score
//8