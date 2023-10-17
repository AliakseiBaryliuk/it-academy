package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        //lower case for variables
        int[] Arr1 = new int[15];
        int[] Arr2 = new int[10];
        Random random = new Random();
        //empty line for better readability
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i] = random.nextInt(100);
        }    //empty line for better readability

        for (int i = 0; i < Arr2.length; i++) {
            Arr2[i] = random.nextInt(100);
            if (Arr2[i] % 2 == 0) {
                Arr2[i] += 1;
            }
        }
        //empty line for better readability
        for (int i = 0; i < Arr2.length; i++) {
            if (Arr1[i] % 2 == 0) {
                Arr1[i] = Arr2[i];
            }
        }
        //empty line for better readability
        if (Arr1.length > Arr2.length) {
            int num = Arr1.length - Arr2.length;
            for (int i = 0; i < num; i++) {
                Arr1[0] += Arr1[Arr1.length - 1 - i];
            }
        }
        System.out.print("Все элементы первого массива: ");
        //empty line for better readability
        for (int i = 0; i < Arr1.length; i++) {
            System.out.print(Arr1[i] + " ");
        }
    }
}
//score
//8