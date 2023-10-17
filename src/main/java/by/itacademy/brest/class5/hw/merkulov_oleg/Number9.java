package by.itacademy.brest.class5.hw.merkulov_oleg;

public class Number9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int b = 1; b <= 9; b++) {
                int c = i * b;
                System.out.print(c);
                //This is redundant
                // Just System.out.print(" ");
                if (c < 10) {
                    System.out.print(" ");
                }
                if (c >= 10) {
                    System.out.print(" ");
                }
            }
        }
    }
}
//score
//8