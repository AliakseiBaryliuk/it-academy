package by.itacademy.brest.class21.cw.builder;


// Шаг 2: Используем паттерн Builder
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Используем внутренний класс Builder для построения объекта Product
        Product product = new Product.Builder()
                .id("Part 2")
                .name("Part 1")
                .build();

        // Выводим результат
        System.out.println("Constructed product: " + product);
    }
}
