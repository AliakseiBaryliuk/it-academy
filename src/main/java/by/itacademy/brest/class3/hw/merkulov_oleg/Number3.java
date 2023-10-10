import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double numb = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double numb2 = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double numb3 = scanner.nextDouble();

        double temp = 0;
        double min = 0;
        double average = 0;
        double max = 0;

        if (numb >= temp) {
            temp = numb;

        }
        if (numb2 >= temp) {
            temp = numb2;

        }
        if (numb3 >= temp) {
            temp = numb3;

        }
        if (numb == temp) {
            max = numb;

            if (numb2 >= numb3) {
                average = numb2;
                min = numb3;

            } else if (numb3 >= numb2) {
                average = numb3;
                min = numb2;

            }
        } else if (numb2 == temp) {
            max = numb2;

            if (numb >= numb3) {
                average = numb;
                min = numb3;

            } else if (numb3 >= numb) {
                average = numb3;
                min = numb2;
            }

        } else if (numb3 == temp) {
            max = numb3;

            if (numb >= numb2) {
                average = numb;
                min = numb2;

            } else if (numb2 >= numb) {
                average = numb2;
                min = numb;
            }
        }
        System.out.println(max + " " + average + " " + min);
    }
}
/*
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int max = scanner.nextInt();
        int min = 0;

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        if (num2 > max){
            min = max;
            max = num2;
        }

        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        int middle;
        if (num3 < min){
            middle = min;
            min = num3;
        } else if (num3 > max){
            middle = max;
            max = num3;
        } else {
            middle = num3;
        }

        System.out.println(max + " " + middle + " " + min);
    }
}
 */
//A bit wordy)
//score
//8
