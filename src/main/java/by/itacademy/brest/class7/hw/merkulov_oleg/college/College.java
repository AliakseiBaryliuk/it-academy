package by.itacademy.brest.class7.hw.merkulov_oleg.college;

import java.util.ArrayList;

public class College {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public College() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void enrollStudentInCourse(String studentName, String courseName) {
        Student student = findStudentByName(studentName);
        Course course = findCourseByName(courseName);
        if (student != null && course != null) {
            student.enrollInCourse(course);
            System.out.println("Студент " + student.getName() + " записан на курс " + course.getName());
        } else {
            System.out.println("Студент или курс не найдены");
        }
    }

    public void listCoursesForStudent(String studentName) {
        Student student = findStudentByName(studentName);
        if (student != null) {
            System.out.println("Курсы для студента " + student.getName() + ":");
            student.listEnrolledCourses();
        } else {
            System.out.println("Студент не найден");
        }
    }

    private Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    private Course findCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return course;
            }
        }
        return null;
    }
}
