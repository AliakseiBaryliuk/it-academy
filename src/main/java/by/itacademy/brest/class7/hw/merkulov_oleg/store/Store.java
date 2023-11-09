package by.itacademy.brest.class7.hw.merkulov_oleg.store;

import java.util.Objects;

public class Store {
    private Product[] products = new Product[5];

    // We should use addProduct(Product product)
    // The warehouse store produces ready-made products rather than producing them itself.
    // What if we try to add a product and we don’t have space?
    public void addProduct(String name, int price, int quantityInStock, String description) {
        for (int i = 0; i < products.length; i++) {
            if (Objects.isNull(products[i])) {
                Product product = new Product(name, price, quantityInStock, description);
                products[i] = product;
                break;
            }
        }
    }

    public void listProduct() {
        System.out.println("Список продуктов в магазине:");
        for (Product product : products) {
            System.out.println("Название: " + product.getName());
            System.out.println("Цена $: " + product.getPrice());
            System.out.println("Количество на складе: " + product.getQuantityInStock());
            System.out.println("Описание: " + product.getDescription());
            System.out.println("-------------------");
        }
    }

    public void sellProduct(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (product.getQuantityInStock() >= quantity) {
                    product.setQuantityInStock(product.getQuantityInStock() - quantity);
                    System.out.println("Продукт успешно продан!");
                } else {
                    System.out.println("Не достаточно. Введите количество еще раз.");
                }
                return;
            }
        }
        System.out.println("Продукт не найден!");
    }
}

