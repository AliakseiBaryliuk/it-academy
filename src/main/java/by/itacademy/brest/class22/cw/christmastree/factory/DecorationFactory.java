package by.itacademy.brest.class22.cw.christmastree.factory;

import by.itacademy.brest.class22.cw.christmastree.ornament.Color;
import by.itacademy.brest.class22.cw.christmastree.ornament.Ornament;


public interface DecorationFactory {
    Ornament createOrnament(Color color);
}
