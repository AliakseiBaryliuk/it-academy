package by.itacademy.brest.class5.hw.saiko_nikita;

public class Task9 {
    public static void main(String[] args) {

        int[] Arr = new int[10];
        for (int i = 1; i < Arr.length; i++) {
            Arr[i] = i;
            System.out.print(" " + Arr[i]);
        }
        System.out.println();
        for (int i = 1; i < Arr.length; i++) {
            Arr[i] = i * 2;
            System.out.print(" " + Arr[i]);
        }
        System.out.println();
        for (int i = 1; i < Arr.length; i++) {
            Arr[i] = i * 3;
            System.out.print(" " + Arr[i]);
        }
    }
}
/*
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();
        }
    }
 */
//score
//6