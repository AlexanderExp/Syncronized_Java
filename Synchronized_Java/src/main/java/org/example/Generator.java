package org.example;

import java.util.concurrent.ArrayBlockingQueue;

class Generator implements Runnable {
    private ArrayBlockingQueue<Integer> buffer;

    public Generator(ArrayBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) { // генерируем 20 чисел
            try {
                buffer.put(i); // добавляем число в буфер
                System.out.println("Generated: " + i);
                Thread.sleep(500); // засыпаем на полсекунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
