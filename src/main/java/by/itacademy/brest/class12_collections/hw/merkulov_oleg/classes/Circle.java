package by.itacademy.brest.class12_collections.hw.merkulov_oleg.classes;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисовать Круг");
    }

    @Override
    //if the area of radius is 5 the area is not equal to 0
    public double area() {
        return 0;
    }
}
//6