package by.itacademy.brest.class5.hw.korsunzew_ilya;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 6, 7};
        int sum = 0;
        //empty line for better readability
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        //empty line for better readability
        double average = (double) sum / numbers.length;
        System.out.println("среднее значение " + average);
        //extra empty line
    }
}
