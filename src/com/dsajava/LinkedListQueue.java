package com.dsajava;

import java.util.LinkedList;

public class LinkedListQueue {
    LinkedList<Integer> queue = new LinkedList<>();

    public void enqueue(int item){
        queue.add(item);
    }

    public int dequeue(){
        return queue.removeFirst();
    }

    public int peek(){
        return queue.getFirst();
    }
    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public String toString(){
        return queue.toString();
    }
}
