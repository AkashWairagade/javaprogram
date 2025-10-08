package com.basics.thread;

public class SharedBox {
    private int data;
    private boolean hasData=false;


    public synchronized void producer(int value) throws InterruptedException {
        while (hasData){ //box is full
            wait();
        }
        data=value;
        System.out.println( Thread.currentThread().getName() + " produced data ==> "+ value);
        hasData=true;
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while(!hasData){
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " data consume ==> "+data);
        hasData=false;
        notify();

    }





}
