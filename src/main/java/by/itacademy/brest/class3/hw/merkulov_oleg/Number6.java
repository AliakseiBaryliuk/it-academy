import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive Number: ");

        long n = scanner.nextLong();
        long fact = 1;

        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
    }
}
//score
//10