package by.itacademy.brest.class22.cw.christmastree.factory;

import by.itacademy.brest.class22.cw.christmastree.ornament.Color;
import by.itacademy.brest.class22.cw.christmastree.ornament.Lights;
import by.itacademy.brest.class22.cw.christmastree.ornament.Ornament;

public class ModernDecorationFactory implements DecorationFactory {

    @Override
    public Ornament createOrnament(Color color){
        return new Lights(color);
    }
}
