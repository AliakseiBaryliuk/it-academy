package by.itacademy.brest.class2.hw.ratomsky_michail;

// !!!Classes are always named with a capital letter!!!
public class task5 {
    public static void main(String[] args) {
        int number = 1235;
        int number2 = 12358;
        // empty line for better readability
        //formatting
        int a = number%10;
        int b = number2%10;
        // empty line for better readability
        /*
            In your solution you should not use if-else because in this case,
            you will check either one value or another, use only if instead of if-else.
            But the task contains just two examples,
            and the solution could only be written for one number, which can be changed every time you run it
         */
        if ( a % 2 == 0 ) {
            System.out.println("Число нечетное");
        } else if ( b % 2 == 0) {
            System.out.println("Число четное");

        }
    }
}
//score
//6