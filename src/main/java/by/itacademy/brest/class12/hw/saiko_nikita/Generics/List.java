package by.itacademy.brest.class12.hw.saiko_nikita.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class List {

    //this is not a universal method
    public static void sortList(ArrayList list) {
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }


    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int z = random.nextInt(100);
            list.add(i, z);
        }
        sortList(list);
    }
}
/*
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
 */
//5