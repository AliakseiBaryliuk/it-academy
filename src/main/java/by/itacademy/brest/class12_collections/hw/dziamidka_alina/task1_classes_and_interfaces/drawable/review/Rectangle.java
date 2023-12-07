package by.itacademy.brest.class12_collections.hw.dziamidka_alina.task1_classes_and_interfaces.drawable.review;

class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник с шириной " + width + " и высотой " + height);
        // Here you can add the code to draw the rectangle
    }

    @Override
    double area() {
        while (width == 0 || height == 0) {
            draw();
        }
        return width * height;
    }
}