package by.itacademy.brest.class6_extra1;

public class MaxSubarraySum {
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
}

