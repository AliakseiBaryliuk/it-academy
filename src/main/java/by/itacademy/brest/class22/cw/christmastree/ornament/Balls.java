package by.itacademy.brest.class22.cw.christmastree.ornament;

public class Balls extends Ornament {
    public Balls(Color color) {
        super(color);
    }

    @Override
    public void decorate() {
        System.out.println("Balls decoration" + color);
    }
}
