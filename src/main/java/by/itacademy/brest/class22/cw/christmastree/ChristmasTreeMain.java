package by.itacademy.brest.class22.cw.christmastree;

import by.itacademy.brest.class22.cw.christmastree.factory.ModernDecorationFactory;
import by.itacademy.brest.class22.cw.christmastree.strategy_factory.ChristmasTreeFactory;
import by.itacademy.brest.class22.cw.christmastree.strategy_factory.CustomChristmasTreeFactory;
import by.itacademy.brest.class22.cw.christmastree.strategy_factory.ModernChristmasTreeFactory;
import by.itacademy.brest.class22.cw.christmastree.strategy_factory.TraditionalChristmasTreeFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTreeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strategy = reader.readLine();
        ChristmasTreeFactory factory;

        switch (strategy){
            case "traditional" -> factory = new TraditionalChristmasTreeFactory();
            case "modern" -> factory = new ModernChristmasTreeFactory(new TraditionalChristmasTreeFactory());
            default -> factory = new CustomChristmasTreeFactory(new TraditionalChristmasTreeFactory(), new ModernDecorationFactory());

        }
        factory.createChristmasTree(10).display();
    }
}
