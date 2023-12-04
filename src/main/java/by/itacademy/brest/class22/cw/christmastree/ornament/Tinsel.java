package by.itacademy.brest.class22.cw.christmastree.ornament;

public class Tinsel extends Ornament {
    public Tinsel(Color color) {
        super(color);
    }

    public void decorate() {
        System.out.println("Tinsel decoration" + color);
    }
}