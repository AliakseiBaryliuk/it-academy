package by.itacademy.brest.class12_collections.hw.merkulov_oleg.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);

        System.out.println("Before removing duplicates: " + numbers);

        removeDuplicates(numbers);

        System.out.println("After removing duplicates: " + numbers);
    }

    public static void removeDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);
    }
}
//9