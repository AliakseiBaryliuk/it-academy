package by.itacademy.brest.class2.hw.merkulov_oleg;

public class NumberSeven {
    public static void main(String[] args) {
        int num = 29;
        //isPrimeNumber - is a better name for this variable. It's quite short, but it's also a telling title.
        boolean flag = false;
        // empty line for better readability
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        //curly braces in if-else!!!
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
//score
//9