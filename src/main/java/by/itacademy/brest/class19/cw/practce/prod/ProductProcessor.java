package by.itacademy.brest.class19.cw.practce.prod;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductProcessor {
    public static Map<String, List<String>> groupManufacturersByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getManufacturer, Collectors.toList())
                ));
    }
}

