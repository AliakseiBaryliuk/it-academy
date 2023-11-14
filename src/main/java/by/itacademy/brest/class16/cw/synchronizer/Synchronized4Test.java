package by.itacademy.brest.class16.cw.synchronizer;

import java.util.function.IntConsumer;

import static java.util.stream.IntStream.range;

public class Synchronized4Test {
    private static int counter1;
    private static int counter2;

    private static final Object firstSync = new Object();
    private static final Object secondSync = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = createIncrCounterThread(500, i -> incrementOneCounter());
        Thread threadTwo = createIncrCounterThread(600, i -> incrementOneCounter());

        Thread threadThree = createIncrCounterThread(500, i -> incrementTwoCounter());
        Thread threadFour = createIncrCounterThread(600, i -> incrementTwoCounter());

        start(threadOne, threadTwo, threadThree, threadFour);

        join(threadOne, threadTwo, threadThree, threadFour);

        System.out.println(counter1);
        System.out.println(counter2);
    }

    private static Thread createIncrCounterThread(final int incrementAmount, IntConsumer intOperation) {
        return new Thread(() -> range(0, incrementAmount).forEach(intOperation));
    }

    private static void incrementOneCounter() {
        synchronized (firstSync){
            counter1++;
        }
    }

    private static synchronized void incrementTwoCounter() {
        synchronized (secondSync){
            counter2++;
        }
    }

    private static void start(Thread threadOne, Thread threadTwo, Thread threadThree, Thread threadFour) {
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }

    private static void join(Thread threadOne, Thread threadTwo, Thread threadThree, Thread threadFour) throws InterruptedException {
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();
    }
}
