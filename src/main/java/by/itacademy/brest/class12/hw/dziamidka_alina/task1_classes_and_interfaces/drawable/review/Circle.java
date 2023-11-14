package by.itacademy.brest.class12.hw.dziamidka_alina.task1_classes_and_interfaces.drawable.review;

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с радиусом " + radius);
        // Here you can add code to draw a circle
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}
