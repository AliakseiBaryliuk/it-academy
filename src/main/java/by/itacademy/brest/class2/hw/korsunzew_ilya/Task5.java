package by.itacademy.brest.class2.hw.korsunzew_ilya;

public class Task5 {
    public static boolean checkEvenLastDigit(int number) {
        //This is redundant, we shouldn't use the Math.abs method because the % operation doesn't matter what the sign is.
        int lastDigit = Math.abs(number % 10);
        // empty line for better readability
        return lastDigit % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkEvenLastDigit(1235));
        System.out.println(checkEvenLastDigit(12358));
    }
}
//score
//7