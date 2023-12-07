package by.itacademy.brest.class12_collections.hw.merkulov_oleg.map;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    private Map<String, Double> products;

    public ProductDatabase() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        products.put(name, price);
    }

    public Product findProductWithHighestPrice() {
        String highestPriceProduct = null;
        double highestPrice = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() > highestPrice) {
                highestPrice = entry.getValue();
                highestPriceProduct = entry.getKey();
            }
        }

        if (highestPriceProduct != null) {
            return new Product(highestPriceProduct, highestPrice);
        } else {
            return null;
        }
    }
}

//public class Main {
  //  public static void main(String[] args) {
    //    ProductDatabase productDatabase = new ProductDatabase();

      //  productDatabase.addProduct("Телефон", 500.0);
        //productDatabase.addProduct("Планшет", 1000.0);
        //productDatabase.addProduct("Ноутбук", 1500.0);

        //System.out.println(productDatabase.findProductWithHighestPrice());
    //}
//}
//9