package by.itacademy.brest.classtwo;

public class ShiftOperator {
    public static void main(String[] args) {
        int num = -8; // Binary: 11111111111111111111111111111000
        int result = num >> 2; // Shift right by 2 positions
// Result: 11111111111111111111111111111110 (-2 in decimal)
        System.out.println(result);

        System.out.println();

        int result1 = num >>> 2; // Shift right by 2 positions
// Result: 00111111111111111111111111111110 (1073741822 in decimal)
        System.out.println(result1);
    }
}
