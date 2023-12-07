package by.itacademy.brest.class16_thread.cw.deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        // Creating two shared resources
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                try {
                    // Introducing a delay to increase the likelihood of deadlock
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try {
                    // Introducing a delay to increase the likelihood of deadlock
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
