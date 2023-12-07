package by.itacademy.brest.class12_collections.hw.saiko_nikita.Map;


import java.util.HashMap;
import java.util.Map;

public abstract class ProductDatabase {
    // naming products instead of map
    public static Map<String, Integer> map = new HashMap<>();

    public static void addProduct(String name, int price) {
        map.put(name, price);
    }

    public static void findProductWithHighestPrice() {
        Map.Entry<String, Integer> maxEntry = null;
        //empty line
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);
    }
}
//7