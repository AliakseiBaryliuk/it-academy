package by.itacademy.brest.class12_collections.hw.merkulov_oleg.generics;

import java.util.Arrays;
import java.util.List;

public class TestPair {
    public static <T extends Comparable<T>> void findMinMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        T min = list.get(0);
        T max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(min) < 0) {
                min = current;
            }
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        findMinMax(list1);

        List<String> list2 = Arrays.asList("Машина", "Дом", "Стол");
        findMinMax(list2);
    }
}
//9