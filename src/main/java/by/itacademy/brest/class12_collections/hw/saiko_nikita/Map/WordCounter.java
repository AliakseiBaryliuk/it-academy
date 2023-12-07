package by.itacademy.brest.class12_collections.hw.saiko_nikita.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordCounter {
    //you should create just one instance
    private static Scanner sc = new Scanner(System.in);

    public static void simvol() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = sc.nextLine();
        map.put(str, str.length());
        str = String.valueOf(str.split("").length);
        System.out.println(str);
    }

    public static void word() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = sc.nextLine();
        str = String.valueOf(str.split(" ").length);
        map.put(str, str.length());
        System.out.println(str);

    }

    public static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        //use while instead
        for (; ; ) {
            System.out.println("Введите 1 чтобы вывести кол-во символов\nВведите 2 что вывести кол-во слов");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    simvol();
                    break;
                case 2:
                    word();
                    break;
            }
        }
        //use end condition
    }
}
//check implementation. It does not work(
//4