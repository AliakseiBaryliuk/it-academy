package by.itacademy.brest.class22.cw.christmastree.ornament;

public class Lights extends  Ornament {
    public Lights(Color color) {
        super(color);
    }

    public void decorate() {
        System.out.println("Lights decoration" + color);
    }
}
