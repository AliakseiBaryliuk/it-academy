package by.itacademy.brest.class22.cw.christmastree;

import by.itacademy.brest.class22.cw.christmastree.ornament.Ornament;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    private List<Ornament> ornaments = new ArrayList<>();

    public void addOrnament(Ornament ornament) {
        ornaments.add(ornament);
    }

    public void display() {
        System.out.println("Christmas Tree with Ornaments:");
        for (Ornament ornament : ornaments) {
            ornament.decorate();
        }
    }
}

