package by.itacademy.brest.class15.cw.serialization.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    public static final String MESSAGE_DATA = "message.data";
    private String firstName;
    private String lastName;
    private Integer age;

    public Employee(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        try (final FileOutputStream fos = new FileOutputStream(MESSAGE_DATA);
             final ObjectOutputStream oos = new ObjectOutputStream(fos)){

//            oos.writeInt(300);
            oos.writeObject("Test Message");
//            oos.writeObject(LocalDateTime.now());
//            oos.writeObject(new Employee("John", "Doe", 24));

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (final FileInputStream fis = new FileInputStream(MESSAGE_DATA);
             final ObjectInputStream ois = new ObjectInputStream(fis)){
            int value = 0;
            while ((value = fis.read()) != -1){
                System.out.println((char) value);
            }
//            final int num = ois.readInt();
            final String message = (String) ois.readObject();
//            final LocalDateTime time = (LocalDateTime) ois.readObject();
//            final Employee employee = (Employee) ois.readObject();

            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

