package by.itacademy.brest.class15.cw.thread;

import java.io.ByteArrayInputStream;

public class Producer implements Runnable{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            store.put();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
