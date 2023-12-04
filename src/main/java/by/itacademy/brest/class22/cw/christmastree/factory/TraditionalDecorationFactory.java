package by.itacademy.brest.class22.cw.christmastree.factory;

import by.itacademy.brest.class22.cw.christmastree.ornament.Balls;
import by.itacademy.brest.class22.cw.christmastree.ornament.Color;
import by.itacademy.brest.class22.cw.christmastree.ornament.Ornament;
import by.itacademy.brest.class22.cw.christmastree.ornament.Tinsel;

import java.util.Random;

public class TraditionalDecorationFactory implements DecorationFactory {
    private Random random = new Random(2);

    @Override
    public Ornament createOrnament(Color color) {
        return random.nextInt() == 1 ? new Tinsel(color) : new Balls(color);
    }
}
