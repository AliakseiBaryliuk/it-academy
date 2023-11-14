package by.itacademy.brest.class12.hw.saiko_nikita.Generics;

public class Pair<F, S> {
    // as we discussed earlier we should name our generics accordens conventions for generics java
    // https://www.w3schools.blog/generics-terms-and-naming-convention
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public String toString() {
        return "Pair " +
                "first " + first +
                " second " + second
               ;
    }

    public static void main(String[] args) {

        Pair<String,Integer>p1= new Pair<>("Vadim",20);
        Pair<Float,Integer>p2= new Pair<>(20f,40);
        System.out.println(p1);
        System.out.println(p2);

    }
}
//7