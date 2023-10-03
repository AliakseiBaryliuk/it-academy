package by.itacademy.brest.class2.hw.merkulov_oleg;

public class NumberSix {
    public static void main(String[] args) {
        int number = 123;
        double sum = 0;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }
        double average = sum / count;
        System.out.println("Среднее арифметическое цифр: " + average);
    }
}
//score
//10