package by.itacademy.brest.class8_regular.cw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        passwordStrengthCheck();
//        emailAddressValidation();
//        matcherTest();
//        groupTest();
    }

    private static void passwordStrengthCheck() {
        String password = "0=za1ghgeH%$";
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])(.{8,})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean isFound = matcher.find();

        if (isFound) {
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group(1));
        } else {
            System.out.println("There is no match");
        }
    }

    private static void emailAddressValidation() {
        String email = "aliaksei.baryliuk@gmail.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean isFound = matcher.find();

        if (isFound) {
            System.out.println(matcher.group());
        } else {
            System.out.println("There is no match");
        }
    }

    private static void matcherTest() {
        String str = "Test - string - test";
        Pattern pattern = Pattern.compile(" +- +");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
            System.out.println(matcher.group());
        }
    }

    private static void groupTest() {
        String str = "      www.it-academy.by    ";
        Pattern pattern = Pattern.compile("www\\.([\\w-]+)\\.by");
        Matcher matcher = pattern.matcher(str);
        boolean isFound = matcher.find();

        if (isFound) {
            System.out.println(matcher.group(1));
        } else {
            System.out.println("There is no match");
        }
    }
}
