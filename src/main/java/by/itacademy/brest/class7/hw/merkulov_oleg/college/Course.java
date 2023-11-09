package by.itacademy.brest.class7.hw.merkulov_oleg.college;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student.getYearOfBirth() <= 2005) {
            students.add(student);
        } else {
            System.out.println("Студент должен быть старше 16 лет.");
        }
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void getDetails() {
        System.out.println("Название курса: " + name);
        System.out.println("Записанные студенты:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
