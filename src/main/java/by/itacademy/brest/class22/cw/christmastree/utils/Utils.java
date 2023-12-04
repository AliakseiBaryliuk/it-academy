package by.itacademy.brest.class22.cw.christmastree.utils;

import by.itacademy.brest.class22.cw.christmastree.ornament.Color;

public class Utils {
    private Utils() {
    }

    public static Color getRandomColor() {
        return new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
    }
}
