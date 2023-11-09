package by.itacademy.brest.class7.hw.merkulov_oleg.college;

public class TestCollege {
    public static void main(String[] args) {
        College college = new College();

        Course course1 = new Course("История");
        Course course2 = new Course("Литература");
        Course course3 = new Course("Обществоведение");

        college.addCourse(course1);
        college.addCourse(course2);
        college.addCourse(course3);

        Student student1 = new Student("Андрей", 2002);
        Student student2 = new Student("Кирилл", 2003);
        Student student3 = new Student("Александр", 2004);

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
    }
}
