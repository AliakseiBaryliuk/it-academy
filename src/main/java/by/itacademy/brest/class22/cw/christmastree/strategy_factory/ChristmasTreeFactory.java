package by.itacademy.brest.class22.cw.christmastree.strategy_factory;

import by.itacademy.brest.class22.cw.christmastree.ChristmasTree;

public interface ChristmasTreeFactory {
    ChristmasTree createChristmasTree(int numberOfOrnaments);
}
