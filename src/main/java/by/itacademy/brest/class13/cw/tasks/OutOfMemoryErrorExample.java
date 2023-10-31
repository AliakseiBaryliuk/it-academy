package by.itacademy.brest.class13.cw.tasks;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        int arraySize = Integer.MAX_VALUE; // Попробуем создать массив максимального размера
        try {
            int[] array = new int[arraySize];
        } catch (OutOfMemoryError e) {
            System.err.println("Произошла ошибка: " + e);
        }
    }
}

