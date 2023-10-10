import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month number from 1 to 12: ");
        int month = scanner.nextInt();
        int days = 0;
        boolean YearNew;
        String[] arrayMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (year % 400 == 0) {
            YearNew = false;
        //extra line to remove
        } else if (year % 100 == 0) {
            YearNew = true;
        //extra line to remove
        } else if (year % 4 == 0) {
            YearNew = false;
            //extra line to remove
        } else {
            YearNew = true;
        }

        switch (month) {
            // In this case, with a one-line solution, curly braces are not needed
            case 1, 3, 5, 7, 8, 10, 12 -> {
                days = 31;
            }
            // In this case, with a one-line solution, curly braces are not needed
            case 4, 6, 9, 11 -> {
                days = 30;
            }
            // extra line to remove
            case 2 -> {
                if (YearNew) {
                    days = 28;
                } else {
                    days = 29;
                }
            }
        }
        System.out.println("In: " + year + " Month: " + arrayMonth[month - 1] + " in total " + days + " Days");
    }
}
//score
//8