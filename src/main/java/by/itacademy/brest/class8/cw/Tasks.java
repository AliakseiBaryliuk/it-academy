package by.itacademy.brest.class8.cw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
//        wordCount();
//        findFirstLastMiddle();
//        symbolsNumber();
//        maxNumberSequence();
//        maxNumberSequenceWithoutPattern();
//        palindrome();
//        changeWords();
    }

    private static void wordCount() {
        String text = "Java is a programming language. Testing is an important part of Java development. Test-driven development (TDD) is a common practice in Java.";

        // Слово для поиска
        String wordToFind = "test";

        // Разделяем строку на слова, используя пробел как разделитель
        String[] words = text.split(" ");

        // Счетчик вхождений
        int count = 0;

        // Перебираем слова и сравниваем их с искомым словом
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToFind)) {
                count++;
            }
        }

        System.out.println("Количество вхождений слова '" + wordToFind + "': " + count);
    }

    private static void findFirstLastMiddle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int length = input.length();

        if (length == 0) {
            System.out.println("Строка пуста.");
        } else {
            // Вывести первый символ
            System.out.println("Первый символ: " + input.charAt(0));

            // Вывести последний символ
            System.out.println("Последний символ: " + input.charAt(length - 1));

            // Вывести средний символ, если длина строки нечетная
            if (length % 2 != 0) {
                int middleIndex = length / 2;
                System.out.println("Средний символ: " + input.charAt(middleIndex));
            }
        }
    }

    private static void symbolsNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int length = input.length();

        if (length == 0) {
            System.out.println("Строка пуста.");
        } else {
            char lastChar = input.charAt(length - 1);

            System.out.println("Символы, совпадающие с последним символом ('" + lastChar + "'):");

            for (int i = 0; i < length; i++) {
                if (input.charAt(i) == lastChar) {
                    System.out.println("Символ '" + lastChar + "' на позиции " + i);
                }
            }
        }
    }

    private static void maxNumberSequence() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d+"); // Регулярное выражение для поиска последовательностей цифр
        Matcher matcher = pattern.matcher(input);

        int maxConsecutiveDigits = 0; // Максимальное количество идущих подряд цифр
        while (matcher.find()) {
            String consecutiveDigits = matcher.group();
            int length = consecutiveDigits.length();
            if (length > maxConsecutiveDigits) {
                maxConsecutiveDigits = length;
            }
        }

        if (maxConsecutiveDigits > 0) {
            System.out.println("Наибольшее количество идущих подряд цифр: " + maxConsecutiveDigits);
        } else {
            System.out.println("В строке нет цифр.");
        }
    }

    private static void maxNumberSequenceWithoutPattern() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int currentCount = 0; // Текущее количество идущих подряд цифр
        int maxCount = 0; // Максимальное количество идущих подряд цифр

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Если текущий символ - цифра, увеличиваем текущее количество
                currentCount++;

                // Если текущее количество больше максимального, обновляем максимальное количество
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                // Если текущий символ не цифра, сбрасываем текущее количество
                currentCount = 0;
            }
        }

        if (maxCount > 0) {
            System.out.println("Наибольшее количество идущих подряд цифр: " + maxCount);
        } else {
            System.out.println("В строке нет цифр.");
        }
    }

    private static void palindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Удаление пробелов и преобразование в нижний регистр для корректной проверки
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Введенная строка является палиндромом.");
        } else {
            System.out.println("Введенная строка не является палиндромом.");
        }
    }

    private static void changeWords() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Разделение строки на слова, используя пробел как разделитель
        String[] words = input.split(" ");

        if (words.length < 2) {
            System.out.println("Недостаточно слов для обмена.");
            return;
        }

        int maxLength = words[0].length(); // Длина самого длинного слова
        int minLength = words[0].length(); // Длина самого короткого слова
        int longestWordIndex = 0; // Индекс самого длинного слова
        int shortestWordIndex = 0; // Индекс самого короткого слова

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordLength = word.length();

            if (wordLength > maxLength) {
                maxLength = wordLength;
                longestWordIndex = i;
            }

            if (wordLength < minLength) {
                minLength = wordLength;
                shortestWordIndex = i;
            }
        }

        if (longestWordIndex != -1 && shortestWordIndex != -1) {
            // Обмен местами самого длинного и самого короткого слов
            String temp = words[longestWordIndex];
            words[longestWordIndex] = words[shortestWordIndex];
            words[shortestWordIndex] = temp;

            // Формирование результирующей строки
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                result.append(word).append(" ");
            }

            System.out.println("Результат обмена: " + result.toString().trim());
        } else {
            System.out.println("Не удалось найти слова для обмена.");
        }
    }
}
