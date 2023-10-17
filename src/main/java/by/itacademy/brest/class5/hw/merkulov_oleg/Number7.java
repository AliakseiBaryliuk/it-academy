package by.itacademy.brest.class5.hw.merkulov_oleg;

import java.util.Arrays;
import java.util.Random;

public class Number7 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(10) + 1;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }

        int size2 = random.nextInt(20) + 1;
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = random.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            if (i < array2.length) {
                if (array[i] % 2 == 0) {
                    if (array2[i] % 2 != 0) {
                        array[i] = array2[i];
                    }
                }
            } else {
                array[i] += array[0];
            }
        }

        System.out.println("Измененный первый массив: " + Arrays.toString(array));
    }
}
/*
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов в первом  массиве: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Введите количество элементов во втором  массиве: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        Random random = new Random();

        for (int i = 0; i < n1; i++) {
            int num = random.nextInt(100);
            arr1[i] = num;
        }

        for (int i = 0; i < n2; i++) {
            int num = random.nextInt(100);
            arr2[i] = num;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (i > arr2.length - 1){
                arr1[0] += arr1[i];
            } else if (i%2 == 0 && i < arr2.length - 2){
                arr1[i] = arr2[i + 1];
            }
        }

        for (int i = 0; i < n1; i++) {
            System.out.println(arr1[i]);
        }
    }
 */
//score
//9