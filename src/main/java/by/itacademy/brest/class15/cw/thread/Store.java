package by.itacademy.brest.class15.cw.thread;

public class Store {
    private int product;

    public synchronized void get() {
        if (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println(Thread.currentThread().getName() + "; Get; Number of product = " + product);
        notifyAll();
    }

    public synchronized void put() {
        if (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println(Thread.currentThread().getName() + "; Put; Number of product = " + product);
        notifyAll();
    }
}
