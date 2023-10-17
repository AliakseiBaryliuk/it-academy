package by.itacademy.brest.class5.hw.korsunzew_ilya;

public class Task13 {
    public static void main(String[] args) {
        int[] numbers = {4, -2, 7, -8, 1, 9, -1, 6, 3};

        int maxSum = 0;
        int currentSum = 0;

        int start = 0;
        int end = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];

            if (currentSum <= 0) {
                currentSum = 0;
                start = i + 1;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
            }
        }

        System.out.println("Наибольшая сумма последовательности: " + maxSum);
        System.out.println("Последовательность: ");
        for (int i = start; i <= end; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
//score
//10
