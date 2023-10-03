package by.itacademy.brest.class2.hw.dziamidka_alina;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        // empty line for better readability
        System.out.print("Введите целое число: ");
        int a = number.nextInt();
        // empty line for better readability
        //boolean isPrimeNumber = false;
        // i<= a / 2; It makes no sense for us to check more than a / 2 because % will always not be equal to 0
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                //isPrimeNumber = true;
                //break;
                System.out.println("Число " + a + " не является простым");
                return;
            }
        }
        /*
            if (isPrimeNumber) {
                System.out.println("Число " + a + " является простым");
            } else {
                System.out.println("Число " + a + " не является простым");
            }
         */
        System.out.println("Число " + a + " является простым");
    }
}
//it is not a good idea to use return in this case
/*
break is used to exit (escape) the for-loop, while-loop, switch-statement that you are currently executing.
return will exit the entire method you are currently executing (and possibly return a value to the caller, optional).
 */
//score
//7
