package by.itacademy.brest.class5.hw.dziamidka_alina;

import java.util.Random;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num = random.nextInt(201) - 100;
            arr[i] = num;
        }

        int temp = 0;
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int maxSum = -100 * arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
                temp = i + 1;
            }

            if (sum > maxSum) {
                maxSum = sum;
                startIndex = temp;
                endIndex = i;
            }
        }

        System.out.println("Наибольшая последовательность в массиве: ");

        for (int i = startIndex; i <= endIndex; i++) {
           System.out.print(arr[i] + " ");
        }

    }
}
/*
   public static void main(String[] args) {
        int[] arr = {-2, 1, 2, 1, -3};

        int maxSum = arr[0];
        int currentSum = arr[0];

        int startIndex = 0;
        int endIndex = 0;
        int currentStartIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                currentStartIndex = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = currentStartIndex;
                endIndex = i;
            }
        }

        System.out.println("Наибольшая последовательность подряд идущих чисел:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nСумма элементов этой последовательности: " + maxSum);
    }
 */
//score
//10

//result 8.875 + 0.5 = 9.375