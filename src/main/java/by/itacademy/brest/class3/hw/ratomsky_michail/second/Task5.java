package by.itacademy.brest.class3.hw.ratomsky_michail.second;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("Введите год");
        int yearNew = hello.nextInt();

        //boolean isLeapYear;
        if (yearNew % 400 == 0) {
            System.out.println("Год: " + yearNew + " Високосный");
        } else if (yearNew % 4 == 0) {
            System.out.println("Год: " + yearNew + " Високосный");
        } else if (yearNew % 100 != 0) {
            System.out.println("Год: " + yearNew + " Не Високосный");
        }

        System.out.println("Введите месяц");
        String month = hello.next();
        switch (month) {
            case "Январь":
            case "Март":
            case "Май":
            case "Июль":
            case "Август":
            case "Октябрь":
            case "Декабрь":
                System.out.println(31 + " День");
                break;
            case "Апрель":
            case "Июнь":
            case "Сентябрь":
            case "Ноябрь":
                System.out.println(30 + " Дней");
                break;
            case "Февраль": {
                 // boolean isLeapYear in if part
            } if (yearNew % 400 == 0 || yearNew % 4 == 0) {
                System.out.println(29 + " Дней");
            } else {
                System.out.println(28 + " Дней");
            }
        }
    }

}
//check output for 1900 and Февраль.
// Try using boolean isLeapYear; determine the number of days in February
//score
//6