package com.dsajava;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> S1 = new Stack<>();
    private Stack<Integer> S2 = new Stack<>();

    public void enqueue(int item) {
        S1.push(item);
    }



    public int dequeue() {
        if (S2.isEmpty()) {
            if (S1.isEmpty()) {
                throw new IllegalStateException();
            }
            while (!S1.isEmpty()) {
                S2.push(S1.pop());
            }
        }
        return S2.pop();
    }
}
