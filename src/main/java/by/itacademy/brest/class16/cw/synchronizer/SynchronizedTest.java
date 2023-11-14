package by.itacademy.brest.class16.cw.synchronizer;

import static java.util.stream.IntStream.range;

public class SynchronizedTest {
    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = createIncrCounterThread(500);
        Thread threadTwo = createIncrCounterThread(600);

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println(counter);
    }

    private static Thread createIncrCounterThread(final int incrementAmount) {
        return new Thread(() -> range(0, incrementAmount).forEach(i -> incrementCounter()));
    }

    private static synchronized void incrementCounter() {
        counter++;
    }
}
