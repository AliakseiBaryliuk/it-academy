package by.itacademy.brest.class22.cw.christmastree.ornament;

public abstract class Ornament {
    protected Color color;
    public abstract void decorate();

    Ornament(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
