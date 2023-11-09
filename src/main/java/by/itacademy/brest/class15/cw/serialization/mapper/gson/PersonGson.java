package by.itacademy.brest.class15.cw.serialization.mapper.gson;



public class PersonGson {
    private String name;
    private int age;

    public PersonGson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonGson{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
