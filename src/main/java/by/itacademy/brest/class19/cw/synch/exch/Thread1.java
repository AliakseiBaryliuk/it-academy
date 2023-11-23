package by.itacademy.brest.class19.cw.synch.exch;

import java.util.concurrent.Exchanger;

class Thread1 implements Runnable {
    Exchanger<String> exchanger;
    Thread1(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }
    public void run() {
        try {
            String message =
                    exchanger.exchange("Hi");
            System.out.printf("Thread: %s : Message = %s", Thread.currentThread().getName(), message);
            System.out.println();
        } catch (InterruptedException ex) {
            /* ... */
        }
    }
}
