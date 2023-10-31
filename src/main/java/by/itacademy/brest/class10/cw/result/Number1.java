package by.itacademy.brest.class10.cw.result;

import java.util.Random;

public class Number1 {
    public static void main(String[] args) {
        int arr1[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(101);
            //you should use it outside the for loop
            for (int num : arr1) {
                if (num > 50) {
                    System.out.println(num + " больше 50");
                } else {
                    System.out.println(num + " меньше 50");
                }
            }
        }
    }
}
//7
