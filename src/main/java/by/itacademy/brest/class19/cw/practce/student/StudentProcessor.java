package by.itacademy.brest.class19.cw.practce.student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentProcessor {
    public static Map<Integer, List<Student>> groupAndFilterStudents(List<Student> students, int targetCourse, double minAverageGrade) {
        return students.stream()
                .filter(student -> student.getCourse() == targetCourse)
                .filter(student -> student.getAverageGrade() >= minAverageGrade)
                .collect(Collectors.groupingBy(Student::getCourse));
    }
}
