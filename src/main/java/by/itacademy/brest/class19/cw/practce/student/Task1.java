package by.itacademy.brest.class19.cw.practce.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 1, 4.2),
                new Student("Bob", 2, 3.8),
                new Student("Charlie", 1, 4.5)
        );

        int targetCourse = 1;
        double minAverageGrade = 4.0;

        Map<Integer, List<Student>> groupedByCourse = StudentProcessor.groupAndFilterStudents(students, targetCourse, minAverageGrade);

        System.out.println(groupedByCourse);
    }
}
