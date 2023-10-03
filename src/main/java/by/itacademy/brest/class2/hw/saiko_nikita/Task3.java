package by.itacademy.brest.class2.hw.saiko_nikita;

public class Task3 {
    public static void main(String[] args) {
//        Напишите программу, которая находит наибольшее число числа 3681 и выводит на
//        печать “Четное” если  четное и “Не четное” если нет
        int num = 3681;
        //empty line for better readability
        int a = num / 1000;
        int b = num / 100 % 10;
        int c = num / 10 % 10;
        int d = num % 10;
        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);
        //camel case - maxNum
        int maxnum = Math.max(max1, max2);
        //empty line for better readability
        //You should always use curly braces to separate the body if-else:
        if (maxnum % 2 == 0)
            System.out.println("Максималиная цифра четная:");
        else
            System.out.println("Максимальная цифра не четная:");
        System.out.println(maxnum);
    }
}
//score
//9

