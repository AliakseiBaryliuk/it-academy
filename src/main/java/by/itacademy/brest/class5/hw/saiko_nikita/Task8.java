package by.itacademy.brest.class5.hw.saiko_nikita;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        int sum = a + b;

        System.out.print("Сколько будет a+b: ");
        for (int i = 1; i < 4; i++) {
            int res = sc.nextInt();

            switch (i) {
                case 1, 2 -> {
                    if (res == sum) {
                        System.out.println("Верно");
                        //You should always use curly braces to separate the body if-else:
                    } else System.out.println("Попытайтесь снова");
                    System.out.print("Сколько будет a+b: ");
                    //It is redundant
                    break;
                }
                case 3 -> {
                    if (res == sum) {
                        System.out.println("Верно");
                        //You should always use curly braces to separate the body if-else:
                    } else System.out.println("Все приплыли!");
                    //It is redundant
                    break;
                }
            }
        }
    }
}
//score
//9
