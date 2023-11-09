package by.itacademy.brest.class15.cw.thread;

public class TestStore {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Thread prod = new Thread(producer, "Thread_1");
        Thread prod1 = new Thread(producer, "Thread_2");
        Thread cons = new Thread(new Consumer(store), "Thread_3");
        prod.start();
        prod1.start();
        cons.start();

    }
}