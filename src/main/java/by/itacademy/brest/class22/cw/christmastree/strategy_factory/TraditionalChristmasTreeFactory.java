package by.itacademy.brest.class22.cw.christmastree.strategy_factory;

import by.itacademy.brest.class22.cw.christmastree.ChristmasTree;
import by.itacademy.brest.class22.cw.christmastree.factory.TraditionalDecorationFactory;
import by.itacademy.brest.class22.cw.christmastree.utils.Utils;

import java.util.stream.Stream;


public class TraditionalChristmasTreeFactory implements ChristmasTreeFactory {
    private TraditionalDecorationFactory factory;

    public TraditionalChristmasTreeFactory() {
        this.factory = new TraditionalDecorationFactory();
    }

    @Override
    public ChristmasTree createChristmasTree(int numberOfOrnaments) {
        ChristmasTree tree = new ChristmasTree();

        Stream.iterate(0, i -> i + 1)
                .limit(numberOfOrnaments)
                .map(i -> factory.createOrnament(Utils.getRandomColor()))
                .forEach(tree::addOrnament);

        return tree;
    }
}
