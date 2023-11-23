package by.itacademy.brest.class19.cw.practce.prod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", "Dell"),
                new Product("Refrigerator", "Appliances", "Samsung"),
                new Product("Smartphone", "Electronics", "Apple")
        );

        Map<String, List<String>> manufacturersByCategory = ProductProcessor.groupManufacturersByCategory(products);

        System.out.println(manufacturersByCategory);
    }
}
