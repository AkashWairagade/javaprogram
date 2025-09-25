package com.basics.arrays;


// [10,20,30,40,50]
//  R
//  F
//  C
// this class will have  enqueue , dequeue and display


import java.util.Arrays;

public class ArraysQueue {
    private int[] items;
    private int rear;
    private int front;
    // this count will keep track of number of elements
    int count;

    public ArraysQueue(int capacity) {
        items = new int[capacity];
    }

    // method to write into queue
    public void enqueue(int item) {
        //[10,0,0,0,0]
        if (count == items.length) {
            throw new QueueFullException("Queue is full");
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            throw new QueueEmptyException("Your queue is empty");
        }
        int frontItem = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return frontItem;
    }


    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        ArraysQueue queue = new ArraysQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("item removed from front is " + queue.dequeue());
        System.out.println("item removed from front is " + queue.dequeue());


        System.out.println(queue);

        System.out.println("item removed from front is " + queue.dequeue());
        System.out.println("item removed from front is " + queue.dequeue());
        System.out.println(queue);
    }

}

class QueueFullException extends RuntimeException {

    QueueFullException(String exp) {
        super(exp);
    }

}

class QueueEmptyException extends RuntimeException {

    public QueueEmptyException(String exceptionName) {
        super(exceptionName);
    }
}

//[0, 0, 30, 40, 50]
//         F       R
// 5-> 0         R %length
// 6-> 1
// 7 ->2
// 8-> 3
// 9 ->4
// 10 ->0
// (rear+1)%10