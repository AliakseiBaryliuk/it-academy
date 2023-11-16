package by.itacademy.brest.class17.cw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Path textPath = Paths.get("text.txt");
        List<String> listLines;
        try {
//            Stream<String> streamLines2 = Files.lines(textPath);
            listLines = Files.readAllLines(textPath);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        filter(listLines);

        Integer reduce = listLines.stream()
                .map(String::length)
                .reduce(0, (a, b) -> a + b);
//                .reduce(0, Integer::sum);

//        sortedListStreng(listLines, 10).forEach(System.out::println);

//        getGroupOfWords(listLines).forEach(
//                (word, numberOfOccurrences)  -> System.out.printf("%s: %d; %n", word, numberOfOccurrences));


//        getMapOfWords(listLines).forEach(
//                (word, numberOfLetters)  -> System.out.printf("%s: %d; %n", word, numberOfLetters));


//        findFirst(listLines);

    }

    private static Map<String, Long> getGroupOfWords(List<String> listLines) {
        return listLines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<String, Integer> getMapOfWords(List<String> listLines) {
        return listLines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(Collectors.toMap(Function.identity(), String::length, (first, second) -> first));
    }

    private static List<String> sortedListStreng(List<String> listLines, int lettersNumber) {
        Predicate<String> lineLength = line -> line.length() > lettersNumber;

        return listLines.stream()
                .filter(lineLength)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }

    private static void filter(List<String> listLines) {
        listLines.stream()
                .filter(line -> line.length() > 10)
                .limit(1)
                .forEach(System.out::println);
    }

    private static void findFirst(List<String> listLines) {
        listLines.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
