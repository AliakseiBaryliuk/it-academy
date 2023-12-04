package by.itacademy.brest.class22.cw;

import java.util.Date;

public class AnnotationTest {
    public static void main(String[] args) {
        printDate(1);
        useDeprecatedMethod();
    }

    @Deprecated
    public static void printDate(int date) {
        System.out.println("date = " + date);
    }

    @SuppressWarnings("deprecation")
    public static void useDeprecatedMethod() {
        Date date = new Date();
        date.setDate(10000);
    }

}
