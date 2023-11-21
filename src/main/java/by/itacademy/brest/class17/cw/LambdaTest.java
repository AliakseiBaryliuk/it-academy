package by.itacademy.brest.class17.cw;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        //локальная переменная должна быть неизменна - "final"
        int limit = 10000;

        Applicable func = new Applicable() {
            @Override
            public int apply(int a, int b) {
                int result = 1;
                for (int i = 0; i < b && result < limit; i++) {
                    result *= a;
                }
                return result;
            }
        };

        Applicable func1 = (a, b) -> {
            int result = 1;
            for (int i = 0; i < b && result < limit; i++) {
                result *= a;
            }
            return result;
        };

        System.out.println(func.apply(2, 2));


    }
}
