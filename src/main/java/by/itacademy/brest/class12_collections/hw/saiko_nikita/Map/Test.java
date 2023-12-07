package by.itacademy.brest.class12_collections.hw.saiko_nikita.Map;

import java.util.Scanner;
// you should not extends but create the instance of ProductDatabase
public class Test extends ProductDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //use while instead
        for (; ; ) {
            System.out.println("Введите 1 чтобы добавить тваар\nВведите 2 что вывести максималиную цену");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Введите имя");
                    String name = sc.next();
                    System.out.println("Введите цену");
                    int price = sc.nextInt();
                    addProduct(name, price);
                    break;
                case 2:
                    findProductWithHighestPrice();
            }
        }
    }
}