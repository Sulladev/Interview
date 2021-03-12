package ru.pirozhkov.hw3.pingpong;

public class ThreadPong implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            System.out.println("pong");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
