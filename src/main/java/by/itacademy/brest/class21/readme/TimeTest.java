package by.itacademy.brest.class21.readme;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {
    public static void main(String[] args) {
//        Get the current date and time using the LocalDateTime class.
        LocalDateTime currentDateTime = LocalDateTime.now();

//        Format a LocalDate or LocalDateTime to a string or parse a string to a LocalDate.
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse("2023-01-01", formatter);

//        Use the Duration class to represent a time span and perform arithmetic operations.
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plus(Duration.ofHours(2));


//        Compare two LocalDate or LocalDateTime objects.
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);
        boolean isAfter = date1.isAfter(date2);

//        Convert a ZonedDateTime to a different time zone.
        ZonedDateTime originalTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime convertedTime = originalTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZoneId.getAvailableZoneIds().forEach(System.out::println);



    }
}
