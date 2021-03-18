package ru.pirozhkov.hw3.pingpong;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadPing = new Thread(new ThreadPing());
        Thread threadPong = new Thread(new ThreadPong());
        threadPing.start();
        Thread.sleep(1000);
        threadPong.start();
    }
}
