package com.dsajava;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueStack {
    private Queue<Integer> Q1 = new ArrayDeque<>();
    private Queue<Integer> Q2 = new ArrayDeque<>();
    private int size;

    public void push(int item){
        while(!Q1.isEmpty()){
            Q2.add(Q1.remove());
        }
        Q1.add(item);
        while (!Q2.isEmpty()){
            Q1.add(Q2.remove());
        }
        size++;
    }

    public int pop(){
        if(Q1.isEmpty()){
            throw new IllegalStateException();
        }
        size--;
        return Q1.remove();
    }
    public int peek(){
        if(Q1.isEmpty()){
            throw new IllegalStateException();
        }
        return Q1.peek();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return Q1.isEmpty();
    }
}
