package com.queueinterface.implementstackusingqueue;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top Element: " + stack.top()); // Should print 3
        System.out.println("Popped: " + stack.pop()); // Should print 3
        System.out.println("Top Element: " + stack.top()); // Should print 2
    }
}
