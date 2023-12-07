package by.itacademy.brest.class12_collections.hw.saiko_nikita.Classes_and_interfaces;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle();
        System.out.println(circle.area(radius, radius));

        System.out.println("Введите длину: ");
        double longs = sc.nextDouble();
        System.out.println("Введите ширину: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.area(longs, width));
    }
}
//5