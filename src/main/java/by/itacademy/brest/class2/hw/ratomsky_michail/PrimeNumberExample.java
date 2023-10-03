package by.itacademy.brest.class2.hw.ratomsky_michail;

public class PrimeNumberExample {

    public static void main(String[] args) {
        int num = 29;
        boolean isPrimeNumber = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrimeNumber = true;
                break;
            }
        }

        if (!isPrimeNumber) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}