package org.example;

import java.util.concurrent.ArrayBlockingQueue;

class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> buffer;

    public Consumer(ArrayBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int num = buffer.take(); // берём число из буфера
                System.out.println("Consumed: " + num);
                Thread.sleep(1000); // засыпаем на секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
