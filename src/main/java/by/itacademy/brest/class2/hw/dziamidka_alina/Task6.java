package by.itacademy.brest.class2.hw.dziamidka_alina;

public class Task6 {
    public static void main(String[] args) {
        int a = 123;
        int num3 = a % 10;
        int num2 = a / 10 % 10;
        int num1 = a / 100;
        // empty line for better readability
        // avg is a better name for this variable. It's quite short, but it's also a telling title.
        double ave = (num1 + num2 + num3) / 3D;

        System.out.println("Среднее арифметическое цифр числа " + a + " равно " + ave);
    }
}
//score
//9