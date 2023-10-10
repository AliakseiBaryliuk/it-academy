import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double numb = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double numb2 = scanner.nextDouble();

        double result = 0;
        if (operator == '+') {
            result = numb + numb2;
        //extra line to remove
        } else if (operator == '-') {
            result = numb - numb2;
            //extra line to remove
        } else if (operator == '*') {
            result = numb * numb2;
            //extra line to remove
        } else if (operator == '/' && numb2 == 0) {
            System.out.print("Error");

            return;
        } else if (operator == '/') {
            result = numb / numb2;
        }
        System.out.print(result);
    }
}
//score
//10