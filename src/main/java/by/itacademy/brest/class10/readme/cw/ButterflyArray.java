package by.itacademy.brest.class10.readme.cw;

public class ButterflyArray {
    public static void main(String[] args) {
        int n = 5; // Размер массива (нечетное число)
        int[][] butterfly = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i && j < n - i || j <= i && j >= n - i - 1) {
                    butterfly[i][j] = 1;
                } else {
                    butterfly[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(butterfly[i][j]);
            }
            System.out.println();
        }
    }
}

