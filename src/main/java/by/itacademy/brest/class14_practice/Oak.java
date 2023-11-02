package by.itacademy.brest.class14_practice;

public class Oak extends SomeTree {

    public Oak(Integer leafNumber, Season season) {
        super("Oak", leafNumber, season);
    }

    @Override
    public TreeType getType() {
        return TreeType.CONIF;
    }
}
