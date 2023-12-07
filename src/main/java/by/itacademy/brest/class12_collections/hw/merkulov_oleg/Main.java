package by.itacademy.brest.class12_collections.hw.merkulov_oleg;

import java.util.Map;

import static by.itacademy.brest.class12_collections.hw.merkulov_oleg.map.ChekWords.countCharacterFrequency;
import static by.itacademy.brest.class12_collections.hw.merkulov_oleg.map.ChekWords.countWordsFrequency;

public class Main {
    public static void main(String[] args) {
        //Drawable circle = new Circle(12);
        //circle.draw();

        //Drawable rectangle = new Rectangle(10,5);
        //rectangle.draw();
        //Shape circle = new Circle(5);
        //System.out.println("Площадь круга: " + circle.area());

        //Shape rectangle = new Rectangle(3, 4);
        //System.out.println("Площадь прямоугольника: " + rectangle.area());;
        //Stack<Integer> stack = new Stack<>();

        //stack.push(1);
        //stack.push(2);
        //stack.push(3);

        //System.out.println(stack.pop());
        //System.out.println(stack.peek());
        //System.out.println(stack.size());
        //System.out.println(stack.isEmpty());
        //ProductDatabase productDatabase = new ProductDatabase();

        //productDatabase.addProduct("Телефон", 500.0);
        //productDatabase.addProduct("Планшет", 1000.0);
        //productDatabase.addProduct("Ноутбук", 1500.0);
        //System.out.println(productDatabase.findProductWithHighestPrice());
        String[] words = {"Car", "House", "Street", "Man", "Book", "Case"};
        Map<String, Integer> wordFrequency = countWordsFrequency(words);

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Слов " + entry.getKey() + ": " + entry.getValue());
        }

        String text = "This is a sample text.";
        Map<Character, Integer> charFrequency = countCharacterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + " Букв: " + entry.getValue());
        }
    }
}
//6

