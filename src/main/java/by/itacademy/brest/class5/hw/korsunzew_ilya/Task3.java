package by.itacademy.brest.class5.hw.korsunzew_ilya;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("вессти масив");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        int maxnumbers = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > maxnumbers) {
                maxnumbers = array[j];
            }
        }
        System.out.println("наибольшее число масива " + maxnumbers);
    }
//extra empty line
}