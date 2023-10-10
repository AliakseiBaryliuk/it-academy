package by.itacademy.brest.class8.cw;

public class StringMethods {
    public static void main(String[] args) {
        String greeting = "Hello" + " IT-Academy" + " Students";
        String intString = 2 + "-not a problem";
        System.out.println(greeting + "\nintString: " + intString);
        System.out.println();

        System.out.println(greeting.length());
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.equals("S"));
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.equalsIgnoreCase(greeting.toUpperCase()));
        System.out.println(greeting.indexOf('I'));
        System.out.println(greeting.startsWith("H"));
        System.out.println(greeting.endsWith("ts"));
        System.out.println(greeting.replace('l', 'o'));
        System.out.println(greeting.substring(greeting.length() - 4));
        System.out.println();
        System.out.println(greeting.join("\n", "Hello", "By"));
        System.out.println();
        System.out.println(greeting);
        System.out.println(greeting.split(" ").length);

        printSum(365);

        checkPool();
    }

    private static void printSum(int source) {
        String value = String.valueOf(source);
        String[] strings = value.split("");
        int sum = 0;

        for (int i = 0; i < strings.length; i++) {
            sum += Integer.parseInt(strings[i]);
        }
        System.out.println("Sum = " + sum);
    }

    private static void checkPool() {
        String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung");

        System.out.println(constantString == newString);

        String internedString = newString.intern();

        System.out.println(constantString == internedString);
    }
}
