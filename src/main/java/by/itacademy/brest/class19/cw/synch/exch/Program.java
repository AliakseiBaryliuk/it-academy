package by.itacademy.brest.class19.cw.synch.exch;

import java.util.concurrent.Exchanger;

public class Program {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new Thread1(exchanger), "Thread-1").start();
        new Thread(new Thread2(exchanger), "Thread-2").start();
    }
}

