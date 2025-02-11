package com.queueinterface.implementstackusingqueue;

import java.util.*;

class MyStack<T> {
    private Queue<T> mainQueue;
    private Queue<T> helperQueue;

    public MyStack() {
        mainQueue = new LinkedList<>();
        helperQueue = new LinkedList<>();
    }

    public void push(T element) {
        mainQueue.add(element);
    }

    public T pop() {
        if (mainQueue.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        while (mainQueue.size() > 1) {
            helperQueue.add(mainQueue.poll());
        }
        T topElement = mainQueue.poll();

        Queue<T> temp = mainQueue;
        mainQueue = helperQueue;
        helperQueue = temp;

        return topElement;
    }

    public T top() {
        if (mainQueue.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        while (mainQueue.size() > 1) {
            helperQueue.add(mainQueue.poll());
        }
        T topElement = mainQueue.poll();
        helperQueue.add(topElement);

        Queue<T> temp = mainQueue;
        mainQueue = helperQueue;
        helperQueue = temp;

        return topElement;
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }
}
