package com.leonardof108.datastructures.queue;

public class Queue {
    private int arr[];
    private int front, rear, capacity;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = rear = 0;
    }

    // Enqueue
    public void enqueue(int x) {
        if (rear == capacity) {
            System.out.println("Queue is Full");
            return;
        }
        arr[rear++] = x;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = arr[front];
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return item;
    }

    // Peek
    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1;
    }

    // Is empty?
    public boolean isEmpty() {
        return rear == front;
    }

    // Display
    public void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Output: 10 20 30
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
        System.out.println("Front element: " + queue.peek()); // Output: 20
    }
}
