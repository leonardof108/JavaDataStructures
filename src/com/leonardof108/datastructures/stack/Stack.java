package com.leonardof108.datastructures.stack;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    // Is empty?
    public boolean isEmpty() {
        return top == -1;
    }

    // Display
    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}
