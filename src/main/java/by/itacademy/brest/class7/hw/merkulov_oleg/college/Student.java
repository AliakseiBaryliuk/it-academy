package by.itacademy.brest.class7.hw.merkulov_oleg.college;

import java.util.ArrayList;

public class Student {
    private String name;
    private int yearOfBirth;
    //usually we have unidirectional relationships. Course contains students
    private ArrayList<Course> courses;

    public Student(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.courses = new ArrayList<>();
    }

    //we should not use enrollInCourse method in Student since only the college is responsible for managing students and courses.
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
    //as well
    public void listEnrolledCourses() {
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }

    public void getDetails() {
        System.out.println("Имя студента: " + name);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("Записанные курсы:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
