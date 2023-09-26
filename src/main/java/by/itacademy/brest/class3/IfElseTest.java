package by.itacademy.brest.class3;

public class IfElseTest {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(getSignOrZero(number));
    }

    private static String getSignOrZero(int number) {
        if (number > 0) {
            return "The number is positive.";
        } else if (number < 0) {
            return "The number is negative.";
        } else {
            return "The number is 0.";
        }
    }
}
