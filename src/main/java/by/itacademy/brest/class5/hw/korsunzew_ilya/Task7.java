package by.itacademy.brest.class5.hw.korsunzew_ilya;

import java.util.Random;

public class Task7 {
    public  static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(101);
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = random.nextInt(101);
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0 && i < secondArray.length) {
                firstArray[i] = secondArray[i] % 2 == 0 ? secondArray[i] + 1 : secondArray[i];
            }
        }

        for (int i = secondArray.length; i < firstArray.length; i++) {
            firstArray[0] += secondArray[secondArray.length - 1];
        }

        for (int num : firstArray) {
            System.out.println(num);
        }
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
//8