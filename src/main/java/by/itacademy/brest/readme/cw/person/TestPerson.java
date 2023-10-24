package by.itacademy.brest.readme.cw.person;

public class TestPerson {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        String name = "Иван";
        people[0] = new Person(name);

        for (int i = 1; i < people.length; i++) {
            people[i] = new Person("Name" + i);
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name)){
                System.out.println(name);
            }
        }
    }
}
