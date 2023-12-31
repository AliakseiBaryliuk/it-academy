package by.itacademy.brest.class15.cw.serialization.mapper.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonJson {
    private String name;
    private int age;

    public PersonJson(@JsonProperty("name") String name, @JsonProperty("age") int age) {
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
        return "PersonJson{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
