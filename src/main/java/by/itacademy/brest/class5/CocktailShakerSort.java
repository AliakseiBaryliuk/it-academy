package by.itacademy.brest.class5;

public class CocktailShakerSort {
    public static void cocktailShakerSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            // Проход слева направо (сортировка минимальных элементов)
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // Если на этом этапе не было обменов, массив уже отсортирован
            }

            swapped = false;

            // Проход справа налево (сортировка максимальных элементов)
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        cocktailShakerSort(arr);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

