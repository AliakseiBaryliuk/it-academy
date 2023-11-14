package by.itacademy.brest.class12.hw.dziamidka_alina.task4_map.count;

import java.util.*;

public class CountWordsInList {

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        //naming word instead of i
        list.forEach(i -> {
            map.put(i, map.getOrDefault(i, 0) + 1);
        });
        return map;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dog", "Cat", "Dog", "Bird", "Cat", "Bird", "Dog", "Bird", "Snake");
        System.out.println(countFrequency(list));
    }
}
//7