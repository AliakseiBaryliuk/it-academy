package by.itacademy.brest.class3.hw.merkulov_oleg;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double numb = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double numb2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        //extra line to remove
        switch (operator) {
            // In this case, with a one-line solution, curly braces are not needed
            case '+' -> {
                result = numb + numb2;

            }
            // In this case, with a one-line solution, curly braces are not needed
            case '-' -> {
                result = numb - numb2;

            }
            // In this case, with a one-line solution, curly braces are not needed
            case '*' -> {
                result = numb * numb2;

            }
            case '/' -> {
                if (numb2 != 0) {
                    result = numb / numb2;

                } else {
                    System.out.println("ERROR. cannot be divided by 0");
                    return;
                }
            }
            default -> System.out.println("ERROR. incorrect operator");
        }
        System.out.println(result);
    }
}
//score
//8