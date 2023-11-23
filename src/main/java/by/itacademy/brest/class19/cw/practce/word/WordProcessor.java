package by.itacademy.brest.class19.cw.practce.word;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordProcessor {
    public static List<String> getUniqueWords(List<String> sentences) {
        return sentences.stream()
                .map(sentence -> sentence.split("\\s+"))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}