package by.itacademy.brest.class11.cw.generics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[\\+-]?\\d+$");
        Scanner scanner = new Scanner(System.in);

        GenericTest<Integer> integer = new IntegerOperation();
        GenericTest<String> str = new StringOperation();

        String value = scanner.nextLine();
        Matcher m = p.matcher(value);

        if (m.matches()) {
            integer.operation(Integer.valueOf(value));
        } else {
            str.operation(value);
        }
    }
}
