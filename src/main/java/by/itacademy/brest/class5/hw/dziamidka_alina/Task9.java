package by.itacademy.brest.class5.hw.dziamidka_alina;

public class Task9 {
    public static void main(String[] args) {
        //It is redundant
        int result = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
/*
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
 */
//score
//8