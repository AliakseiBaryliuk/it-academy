package by.itacademy.brest.class5;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        boolean swapped;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обменять элементы arr[j] и arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Если внутренний цикл не выполнил ни одной замены, массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

