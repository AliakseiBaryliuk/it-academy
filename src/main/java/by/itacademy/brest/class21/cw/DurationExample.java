package by.itacademy.brest.class21.cw;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        // Создаем два момента времени
        LocalDateTime startTime = LocalDateTime.of(2023, 1, 1, 10, 0);
        LocalDateTime endTime = LocalDateTime.of(2023, 1, 1, 12, 30);

        // Вычисляем длительность между двумя моментами времени
        Duration duration = Duration.between(startTime, endTime);

        // Выводим результат
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Duration: " + duration);

        // Получаем значения отдельных компонентов длительности
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.println("Duration in hours: " + hours);
        System.out.println("Duration in minutes: " + minutes);

        // Используем ChronoUnit для получения более детализированных значений
        long hoursWithChronoUnit = ChronoUnit.HOURS.between(startTime, endTime);
        long minutesWithChronoUnit = ChronoUnit.MINUTES.between(startTime, endTime) % 60;

        System.out.println("Duration in hours with ChronoUnit: " + hoursWithChronoUnit);
        System.out.println("Duration in minutes with ChronoUnit: " + minutesWithChronoUnit);
    }
}

