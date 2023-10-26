package by.itacademy.brest.class12.cw;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionCW {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("URL", "http://localhost:8080");

        Set<Integer> hashSet = new HashSet<>();

        Comparator<Integer> integerComparator = getIntegerComparator();

        Set<Integer> treeSet1 = new TreeSet<>();
        Set<Integer> treeSet2 = new TreeSet<>(integerComparator);
        Set<Integer> treeSet3 = new TreeSet<>(new IntegerComparator());

        Set<Integer> set = new LinkedHashSet<>();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);

//        copyOnWriteArrayList();
//        removeElArrayList();
//        queue();
        iterator();
    }


    private static Comparator<Integer> getIntegerComparator() {
        Comparator<Integer> integerComparator = (a, b) -> {
            if (a - b == 0) {
                return 0;
            } else {
                if (a < b) {
                    return -1;
                }
                return 1;
            }
        };
        return integerComparator;
    }

    public static void copyOnWriteArrayList() {

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});

        Iterator<Integer> iterator = numbers.iterator();

        numbers.add(10);

        List<Integer> result = new LinkedList<>();
        iterator.forEachRemaining(result::add);

        for (Integer i : result) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void removeElArrayList() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());

        list.remove(1);
        System.out.println(list.size());
        System.out.println();

        list.forEach(System.out::println);
    }

    public static void queue() {
        Queue<Integer> numbers = new ArrayDeque<>();
// Queue<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers.peek());
        numbers.add(11);
        System.out.println(numbers);

        Queue<Integer> block = new ArrayBlockingQueue<>(2);
        block.add(1);
        block.add(2);
        block.add(3);

    }

    public static void iterator() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next == 2){
                iterator.remove();
            }
        }

        list.forEach(System.out::println);
    }
}
