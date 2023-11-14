package by.itacademy.brest.class12.hw.merkulov_oleg.map;

import java.util.HashMap;
import java.util.Map;

public class ChekWords {
    public static Map<String, Integer> countWordsFrequency(String[] words) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }

    public static Map<Character, Integer> countCharacterFrequency(String text) {
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                characterFrequencyMap.put(c, characterFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        return characterFrequencyMap;
    }
}
//9