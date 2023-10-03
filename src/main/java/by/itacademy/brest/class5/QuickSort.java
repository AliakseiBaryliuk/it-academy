package by.itacademy.brest.class5;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Разделение массива и получение индекса опорного элемента
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем элементы до и после опорного элемента
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Выбираем опорный элемент (можно выбирать иначе)
        int i = (low - 1); // Индекс меньшего элемента

        for (int j = low; j <= high - 1; j++) {
            // Если текущий элемент меньше или равен опорному элементу
            if (arr[j] <= pivot) {
                i++;

                // Обменять arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Обменять arr[i + 1] и опорным элементом (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return (i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int length = arr.length;
        quickSort(arr, 0, length - 1);

        System.out.println("Отсортированный массив:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

