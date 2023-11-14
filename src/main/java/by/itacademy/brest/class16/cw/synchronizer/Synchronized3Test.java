package by.itacademy.brest.class16.cw.synchronizer;

import java.util.function.IntConsumer;

import static java.util.stream.IntStream.range;

public class Synchronized3Test {
    private static int counter1;
    private static int counter2;

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = createIncrCounterThread(500, i -> incrementOneCounter());
        Thread threadTwo = createIncrCounterThread(600, i -> incrementOneCounter());

        Thread threadThree = createIncrCounterThread(500, i -> incrementTwoCounter());
        Thread threadFour = createIncrCounterThread(600, i -> incrementTwoCounter());

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println(counter1);
        System.out.println(counter2);
    }

    private static Thread createIncrCounterThread(final int incrementAmount, IntConsumer intOperation) {
        return new Thread(() -> range(0, incrementAmount).forEach(intOperation));
    }

    private static synchronized void incrementOneCounter() {
        counter1++;
    }

    private static synchronized void incrementTwoCounter() {
        counter2++;
    }
}
