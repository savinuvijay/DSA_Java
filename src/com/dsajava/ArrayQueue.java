package com.dsajava;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front;
    private int rear;
    private int count;
    public ArrayQueue(int size){
        items = new int[size];
        //rear = -1;
    }

    public void enqueue(int item){

        System.out.println("Rear: " + rear);
        System.out.println("Front: " + front);
        if(count == items.length){
            throw new IllegalStateException();
        }
        else {
            items[rear] = item;
            rear = (rear+1) % items.length;
            count++;
        }
    }
    public int dequeue(){
        if(count > 0) {
            int item = items[front];
            items[front] = 0;
            front = (front+1) % items.length;
            count--;
            return item;
        }
        else {
            throw new IllegalStateException();
        }
    }
    public int peek(){
        if(!isEmpty()) {
            return items[front];
        }
        else {
            throw new IllegalStateException();
        }
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public boolean isFull(){
        return front == rear;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
