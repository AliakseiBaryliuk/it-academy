package by.itacademy.brest.class3.hw.ratomsky_michail;

public class Task3 {
    public static void main(String[] args) {
        int a = 2;
        int b = -5;
        int c = 8;
        int temp = 0;
        int temp2 = 0;
        int temp3 = 0;

        if (a > temp) {
            temp = a;
        }
        if (b > temp) {
            temp = b;
        }
        if (c > temp) {
            temp = c;
        }
        if (a > temp2) {
            temp2 = a;
        } else if (b > temp2) ;
        temp2 = b;
        // use || instead of |. See difference
        if (a < temp | a < temp2) {
            temp3 = a;
        }

        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(temp3);


    }
}
//try to check for this
//        int a = 2;
//        int b = -5;
//        int c = 8;
