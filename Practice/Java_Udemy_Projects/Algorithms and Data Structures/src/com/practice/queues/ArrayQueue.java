package com.practice.queues;

import com.practice.sorts.Helpers;

public class ArrayQueue {

    private String[] queue;
    private int front;
    private int back;

    public ArrayQueue() {
        queue = new String[10];
        front = 0;
        back = 0;
    }

    public void enqueue(String item) {
        //System.out.println("enqueue(), adding: " + item + ", front: " + front + ", back: " + back);

        if (back == queue.length) {
            //System.out.println("Increasing the size.");
            String[] newQueue = new String[queue.length * 2];
            for (int i = 0; i < queue.length; i++) {
                newQueue[i] = queue[i];
            }
            queue = newQueue;
        }

        queue[back++] = item;

        //System.out.println("new back: " + back);
        //Helpers.printArray(queue);
    }

    public String dequeue() {
        if (front == back) {
            //System.out.println("Queue is empty, front == back.");
            return null;
        }
        //System.out.println("dequeue(), removing: " + queue[front] + ", front: " + front + ", back: " + back);
        String item = queue[front];
        queue[front] = null;
        front++;

        if (front == back) {
            //System.out.println("front == back => resetting the values back to 0");
            front = 0;
            back = 0;
        }

        //System.out.println("new front: " + front);

        //Helpers.printArray(queue);
        return item;
    }

    public String peek() {
        //System.out.println("peek(), queue[front]: " + queue[front]);
        return queue[front];
    }
}
