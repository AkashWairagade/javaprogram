package com.basics.thread;

public class ThreadCommunicationDemo {

    public static void main(String[] args) {
        SharedBox box = new SharedBox();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    box.producer(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        },"producer-thread");

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    box.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"consumer-thread");

        producer.start();
        consumer.start();

    }
}
