package by.itacademy.brest.class12.hw.merkulov_oleg.generics;

public class Pair<A,A1> {
    // as we discussed earlier we should name our generics accordens conventions for generics java
    // https://www.w3schools.blog/generics-terms-and-naming-convention
    private A value;
    private A1 value2;

    public Pair(A value, A1 value2) {
        this.value = value;
        this.value2 = value2;
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public A1 getValue2() {
        return value2;
    }

    public void setValue2(A1 value2) {
        this.value2 = value2;
    }
}
//7