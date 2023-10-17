package by.itacademy.brest.class5.hw.dziamidka_alina;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");

        int n = scanner.nextInt();

        while (n < 1) {
            System.out.println("Невозможно создать массив. Введите количество чисел в массиве: ");
            n = scanner.nextInt();
        }

        int[] arr = new int[n];

//        // In this case we should not use 3 for loops
//        int min = Integer.MAX_VALUE;
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            if (i%2 == 0) {
//                int num = random.nextInt(100);
//                arr[i] = num;
//            } else {
//                System.out.println("Введите элемент массива: ");
//                arr[i] = scanner.nextInt();
//            }
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
        System.out.println("Введите элементы в массив через пробел: ");

        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            i++;
        }

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num = random.nextInt(100);
            arr[i] = num;
            i++;
        }

        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.print("Минимальный элемент массива равен " + min);
    }
}
//score
//8
