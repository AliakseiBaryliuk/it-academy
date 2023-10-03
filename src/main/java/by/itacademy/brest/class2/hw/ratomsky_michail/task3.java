package by.itacademy.brest.class2.hw.ratomsky_michail;

// !!!Classes are always named with a capital letter!!!
public class task3 {
    public static void main(String[] args) {
        int number = 3681;

        int a = number / 1000;
        int b = number % 1000 / 100;
        int c = number % 100 / 10;
        int d = number % 10;
        int temp = 0;

        if (a > temp) {
            temp = a;
        }
        if (b > temp) {
            temp = b;
        }
        if (c > temp) {
            temp = c;
        }
        if (d > temp) {
            temp = d;
        }

        if (temp % 2 == 0) {
            //extra empty line
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
        //extra empty line

    }
}
//score
//9