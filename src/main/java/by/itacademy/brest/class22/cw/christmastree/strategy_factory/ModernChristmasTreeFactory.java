package by.itacademy.brest.class22.cw.christmastree.strategy_factory;

import by.itacademy.brest.class22.cw.christmastree.ChristmasTree;
import by.itacademy.brest.class22.cw.christmastree.factory.DecorationFactory;
import by.itacademy.brest.class22.cw.christmastree.factory.ModernDecorationFactory;
import by.itacademy.brest.class22.cw.christmastree.utils.Utils;

import java.util.stream.Stream;


public class ModernChristmasTreeFactory implements ChristmasTreeFactory {
    private ChristmasTreeFactory factory;
    private ModernDecorationFactory decorationFactory;

    public ModernChristmasTreeFactory(ChristmasTreeFactory factory) {
        this.factory = factory;
        this.decorationFactory = new ModernDecorationFactory();
    }

    @Override
    public ChristmasTree createChristmasTree(int numberOfOrnaments) {
        int traditionalCount = numberOfOrnaments / 2;
        ChristmasTree tree = factory.createChristmasTree(traditionalCount);

        int modernCount = numberOfOrnaments - traditionalCount;
        Stream.iterate(0, i -> i + 1)
                .limit(modernCount)
                .map(i -> decorationFactory.createOrnament(Utils.getRandomColor()))
                .forEach(tree::addOrnament);

        return tree;
    }
}
