package by.itacademy.brest.class7.hw.saiko_nikita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    //private
    public List<Product> productList;

    public Store() {
        productList = new ArrayList();
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя товара: ");
        String name = sc.next();

        System.out.println("Введите цену товара: ");
        int price = sc.nextInt();

        //check for -20 for instance
        System.out.println("Введите колличество товара: ");
        int quantity = sc.nextInt();

        System.out.println("Введите описание товара: ");
        String descrip = sc.next();

        Product product = new Product(name, price, quantity, descrip);
        System.out.println("Товар добавлен.");
        productList.add(product);
    }

    public void listProduct() {
        System.out.println("Список всех товаров: ");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    public void sellProduct(String productName, int quantity) {
        for (Product product : productList) {
            if (product.name.equals(productName)) {
                if (product.quantityinstock >= quantity) {
                    product.quantityinstock = product.quantityinstock - quantity;
                }
                System.out.println("Неверно введены данные.");
            }
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        Scanner sc = new Scanner(System.in);
        //while(true)
        for (; ; ) {
            System.out.println("1-Добавить продукт.\n2-Вывести весь список продуктов.\n3-Купить продукт.");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    store.addProduct();
                    break;
                case 2:
                    store.listProduct();
                    break;
                case 3:
                    System.out.print("Введите название товара: ");
                    String name = sc.next();
                    System.out.print("Введите сколько хотите купить товара: ");
                    int quant = sc.nextInt();
                    store.sellProduct(name, quant);
                    break;
            }
        }
    }
}
