package by.itacademy.brest.class12_collections.cw;

import java.util.Objects;

public class ClassIterable implements Comparable<ClassIterable>{
    Integer a;

    public Integer getA() {
        return a;
    }

    @Override
    public int compareTo(ClassIterable o) {
        if (o.equals(this) || (o.getA() - getA() == 0)) {
            return 0;
        } else {
            if (o.getA() - getA() < 0) {
                return -1;
            }
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassIterable another = (ClassIterable) o;
        return Objects.equals(a, another.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
