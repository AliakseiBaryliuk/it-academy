package by.itacademy.brest.class18.cw.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SharedObject {

    ReentrantLock lock = new ReentrantLock();
    int counter = 0;

    public void perform() {
        lock.lock();
        try {
            // Critical section here
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public void performTryLock() throws InterruptedException {
        //...
        boolean isLockAcquired = lock.tryLock(1, TimeUnit.SECONDS);

        if(isLockAcquired) {
            try {
                //Critical section here
            } finally {
                lock.unlock();
            }
        }
        //...
    }
}
