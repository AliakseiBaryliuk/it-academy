package by.itacademy.brest.class12_collections.hw.saiko_nikita.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void sortList(ArrayList list) {
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }

    public static void removeList(ArrayList list) {
        ArrayList<Integer> listclean = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        System.out.println(listclean);
    }


    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int z = random.nextInt(10);
            list.add(i, z);
        }
        sortList(list);
        removeList(list);
    }

}
//0