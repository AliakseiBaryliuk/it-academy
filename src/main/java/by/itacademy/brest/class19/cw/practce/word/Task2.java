package by.itacademy.brest.class19.cw.practce.word;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Stream API is powerful",
                "Java programming is fun"
        );

        List<String> uniqueWords = WordProcessor.getUniqueWords(sentences);

        System.out.println(uniqueWords);
    }
}
