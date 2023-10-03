package by.itacademy.brest.class5;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Перемещаем элементы, которые больше key, вперед
            // на одну позицию, чтобы освободить место для вставки
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Вставляем key в правильное место
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);

        System.out.println("Отсортированный массив:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
