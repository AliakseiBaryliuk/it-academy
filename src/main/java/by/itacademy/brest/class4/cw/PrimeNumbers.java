package by.itacademy.brest.class4.cw;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 50; // Максимальное число для поиска простых чисел
        int number = 2; // Начинаем с первого простого числа

        while (number <= n) {
            boolean isPrime = true;

            if (number > 2 && number % 2 == 0) {
                isPrime = false; // Если число больше 2 и четное, оно не является простым
            } else {
                for (int i = 3; i * i <= number; i++) { //i += 2
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }

            number++;
        }
    }
}
