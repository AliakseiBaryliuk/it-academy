package by.itacademy.brest.class3.hw.ratomsky_michail;

public class Task1 {
    public static void main(String[] args) {
        int a = 1900;
        // empty line for better readability
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0))
                System.out.println("Високосный");
        } else {
            System.out.println("Не Високосный");
        }
    }
}
// check 1900
//score
//6


