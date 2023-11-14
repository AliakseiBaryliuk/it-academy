package by.itacademy.brest.class12.hw.dziamidka_alina.task4_map.product;

import java.util.HashMap;

public class testTask {
    public static void main(String[] args) {

        ProductDatabase productDatabase = new ProductDatabase(new HashMap<>());

        productDatabase.addProduct("Tea", 3.5F);
        productDatabase.addProduct("Coffee", 4.6F);
        productDatabase.addProduct("Cacao", 2.5F);

        productDatabase.findProductWithHighestPrice();
    }
}
