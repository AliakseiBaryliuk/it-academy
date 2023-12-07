package by.itacademy.brest.class8_regular.cw;

public class StrBuilders {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hi");
        System.out.println(builder.append(" ").append("there"));
        System.out.println(builder.reverse());
        System.out.println(builder.reverse());
        // Добавляем символ '©' (копирайт, кодовая точка U+00A9) в строку, используя его кодовую точку
        int copyrightSymbolCodePoint = 0x00A9;
        System.out.println(builder.appendCodePoint(copyrightSymbolCodePoint));

        System.out.println(builder.delete(0, 1));
        System.out.println(builder.deleteCharAt(0));

        System.out.println(builder.insert(2, 'a'));
        System.out.println(builder.insert(2, true));

        StringBuffer buffer = new StringBuffer("hi");


    }
}
