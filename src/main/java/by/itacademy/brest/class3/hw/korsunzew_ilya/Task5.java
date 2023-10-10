package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        // empty line for better readability
        switch (month) {
            case 1,3,5,7,9,10,12:
                System.out.println("31 день");
                break;
            case 2:
                System.out.println("28 дней");
                break;

            case 4,6,8,11:
                System.out.println("30 дней");
                break;
            default:
                System.out.println("Ошибка: введен некорректный номер месяца.");
        }
    }
}
/*use new syntax
        switch (month) {
            case 1, 3, 5, 7, 9, 10, 12 -> System.out.println("31 день");
            case 2 -> System.out.println("28 дней");
            case 4, 6, 8, 11 -> System.out.println("30 дней");
            default -> System.out.println("Ошибка: введен некорректный номер месяца.");
        }
 */
//score
//9