package ru.pirozhkov.hw3.lockExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    static int counter = 0;
    public static void increment () {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Locker locker = new Locker();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                locker.startIncrement();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                locker.startIncrement();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);

    }
}

class Locker {
    private Lock lock = new ReentrantLock();

    void startIncrement () {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                Counter.increment();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
