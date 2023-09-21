package by.itacademy.brest.classtwo;

public class ByteProblem {
    public static void main(String[] args) {
        for (byte i = 1; i <= 200; i++) {
            if (i == 127) {
                System.out.println("circle");
            }
            System.out.println(i);
        }
//        byte a = (byte) 129;
//        System.out.println("circle: " + a);
    }
}
