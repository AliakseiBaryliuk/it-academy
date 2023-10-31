package by.itacademy.brest.class10.cw.result;

import by.itacademy.brest.class10.cw.result.Person;

public class TestPerson {
    public static void main(String[] args) {

        Person[] people = new Person[5];

        people[0] = new Person("Иван");
        people[1] = new Person("Олег");
        people[2] = new Person("Петр");
        people[3] = new Person("Мария");
        people[4] = new Person("Евгений");

        for (Person person : people) {
            if (person.getName().equals("Иван")) {
                System.out.println("Иван");
                break;
            }
        }
    }
}
