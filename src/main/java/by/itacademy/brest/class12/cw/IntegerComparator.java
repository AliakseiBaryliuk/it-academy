package by.itacademy.brest.class12.cw;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if (a - b == 0) {
            return 0;
        } else {
            if (a < b) {
                return -1;
            }
            return 1;
        }
    }
}
