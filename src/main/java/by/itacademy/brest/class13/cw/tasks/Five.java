package by.itacademy.brest.class13.cw.tasks;

public class Five {
    public class IllegalArgumentExceptionExample {
        public static void main(String[] args) {
            int number = -5; // Попробуем передать отрицательное число
            try {
                if (number < 0) {
                    throw new IllegalArgumentException("Число не может быть отрицательным");
                }
                // Далее можно выполнять какие-то действия, если число положительное
            } catch (IllegalArgumentException e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }

}
