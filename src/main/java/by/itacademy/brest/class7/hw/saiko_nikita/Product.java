package by.itacademy.brest.class7.hw.saiko_nikita;

import java.util.List;
import java.util.Scanner;

class Product {
    String name;
    int price;
    int quantityinstock;
    String description;
    public static List<Product> productList;

    public Product(String name, int price, int quantityinstock, String description) {
        this.name = name;
        this.price = price;
        this.quantityinstock = quantityinstock;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Имя-" + name + '\'' +
                ", Цена-" + price +
                ", Кол-во на складе-" + quantityinstock +
                ", Описание-'" + description;
    }

    public static void getDetailse() {
        System.out.println("Список всех товаров: ");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    public static void sell(String productName, int quantity) {
        for (Product product : productList) {
            if (product.name.equals(productName)) {
                if (product.quantityinstock >= quantity) {
                    product.quantityinstock = product.quantityinstock - quantity;
                }
            } else System.out.println("Ошибка попробуйте изменить значения.");

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("1-Вывести весь список продуктов.\n2-Купить продукт.");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    getDetailse();
                    break;
                case 2:
                    System.out.print("Введите название товара: ");
                    String name = sc.next();
                    System.out.print("Введите сколько хотите купить товара: ");
                    int quant = sc.nextInt();
                    sell(name, quant);
                    break;

            }

        }
    }

}