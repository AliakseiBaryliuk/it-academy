package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        //camel case arrSize
        int arrsize = sc.nextInt();

        if (arrsize > 0) {
            //lower case for variables
            int[] Arr = new int[arrsize];

            for (int i = 0; i < arrsize; i++) {
                if (i % 2 == 0) {
                    System.out.print("Enter number:");
                    int num = sc.nextInt();
                    Arr[i] = num;
                } else {
                    //put 100 in a separate variable (int bound = 100;) and use it on a line 28 int min = bound;
                    Arr[i] = random.nextInt(100);
                }
            }
            int min = 100;
            for (int i = 0; i < arrsize; i++) {
                if (min > Arr[i]) {
                    min = Arr[i];
                }
            }
            System.out.println( "Minimum number: "+min);
        } else
            System.out.println("Невозможно создать массив");
    }
}
//score
//8