package by.itacademy.brest.class14_practice;

public class Linden extends SomeTree {

    public Linden(Integer leafNumber, Season season) {
        super("Linden", leafNumber, season);
    }

    @Override
    public TreeType getType() {
        return TreeType.CONIF;
    }
}
