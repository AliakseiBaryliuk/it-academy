package by.itacademy.brest.class11.cw.generics;

public class IntegerOperation implements GenericTest<Integer>{
    @Override
    public void operation(Integer value) {
        System.out.println("Integer is " + value);
    }
}
