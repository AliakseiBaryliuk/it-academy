package by.itacademy.brest.class5.hw.korsunzew_ilya;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("длинна масива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("массив");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("массив");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("ввести значение ");
        int start = 0;
        //empty line for better readability
        while (true) {
            start = scanner.nextInt();
            // it does not work may be if (start < 0 || start > array.length - 1) ?
            if (start > 0 || start < array.length) {
                break;
            }
            System.out.println("Ввести значения");
            //empty line for better readability
            int end = 0;
            //empty line for better readability
            while (true) {
                end = scanner.nextInt();
                if (end > 0 || end < array.length) {
                    break;
                }
                System.out.println("не корректный ввод,пробуйте еще раз");
            }
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum = sum + array[i];
            }
            System.out.println(sum);
        }

    }
}
