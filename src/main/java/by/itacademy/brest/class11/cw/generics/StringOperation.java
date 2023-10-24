package by.itacademy.brest.class11.cw.generics;

public class StringOperation implements GenericTest<String>{
    @Override
    public void operation(String value) {
        System.out.println("String is " + value);
    }
}
