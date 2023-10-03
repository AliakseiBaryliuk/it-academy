package by.itacademy.brest.class2.hw.korsunzew_ilya;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        // empty line for better readability
        if (number % 2 == 0) {
            System.out.println("Число " + number + " является четным.");
        } else {
            System.out.println("Число " + number + " является нечетным.");
        }
    }
}
//score
//9