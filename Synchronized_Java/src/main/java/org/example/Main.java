package org.example;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(20); // общий буфер данных размера 10

        Generator generator = new Generator(buffer);
        Consumer consumer = new Consumer(buffer);

        new Thread(generator).start();
        new Thread(consumer).start();
    }
}