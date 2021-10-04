package ch25_thread;

import java.util.Timer;

public class ThreadSample {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new RunnableSample()).start();
            new ThreadExample().start();

        }
        System.out.println("ended");
    }
}

class RunnableSample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("running runnable");
        }

    }
}

class ThreadExample extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("running thread");
        }

    }
}
