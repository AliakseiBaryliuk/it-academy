package by.itacademy.brest.class12_collections.hw.saiko_nikita.Classes_and_interfaces;

public class Circle extends Shape implements Drawable {

    @Override
    public void draw() {

    }
    @Override
    public double area(double x, double y) {
        return super.area(x, y)*3.14;
    }
}
//5