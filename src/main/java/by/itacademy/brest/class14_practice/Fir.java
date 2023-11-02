package by.itacademy.brest.class14_practice;

public class Fir extends SomeTree {

    public Fir(Integer leafNumber, Season season) {
        super("Fir", leafNumber, season);
    }

    @Override
    public TreeType getType() {
        return TreeType.CONIF;
    }
}
