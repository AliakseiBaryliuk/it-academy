package by.itacademy.brest.class5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        char[] chars = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            int abs = Math.abs(array[i]);
            chars[i] =(char) abs;
        }

        String generatedString = new String(chars);

        System.out.println(generatedString);
// ----------------------------------------------------------------
//        int leftLimit = 97; // letter 'a'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
//
//        Random random = new Random();
//        StringBuilder buffer = new StringBuilder(targetStringLength);
//
//        for (int i = 0; i < targetStringLength; i++) {
//            int randomLimitedInt = leftLimit + (random.nextInt(rightLimit - leftLimit));
//            buffer.append((char) randomLimitedInt);
//        }
//        String generatedString = buffer.toString();
//
//        System.out.println(generatedString);
// ----------------------------------------------------------------

//JAVA 8
//        int leftLimit = 97; // letter 'a'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
//        Random random = new Random();
//
//        String generatedString = random.ints(leftLimit, rightLimit + 1)
//                .limit(targetStringLength)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//
//        System.out.println(generatedString);
    }
}
