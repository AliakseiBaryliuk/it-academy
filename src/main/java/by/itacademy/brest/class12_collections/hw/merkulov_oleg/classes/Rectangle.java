package by.itacademy.brest.class12_collections.hw.merkulov_oleg.classes;

public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Нарисовать прямоугольник");
    }

    @Override
    //if the area of radius is 5 the area is not equal to 0
    public double area() {
        return 0;
    }
}