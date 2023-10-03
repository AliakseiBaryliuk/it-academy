package by.itacademy.brest.class5;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length < 2) {
            return; // Базовый случай: массив считается отсортированным, если содержит 0 или 1 элемент
        }

        // Находим середину массива
        int mid = length / 2;

        // Создаем два подмассива
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        // Копируем данные в подмассивы
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = arr[i];
        }

        // Рекурсивно сортируем оба подмассива
        mergeSort(left);
        mergeSort(right);

        // Объединяем отсортированные подмассивы
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int lengthLeft = left.length;
        int lengthRight = right.length;
        int i = 0, j = 0, k = 0;

        // Сравниваем элементы из обоих подмассивов и объединяем их в исходный массив
        while (i < lengthLeft && j < lengthRight) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Копируем оставшиеся элементы из левого подмассива (если таковые есть)
        while (i < lengthLeft) {
            arr[k++] = left[i++];
        }

        // Копируем оставшиеся элементы из правого подмассива (если таковые есть)
        while (j < lengthRight) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

