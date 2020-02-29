package com.dsajava;

import java.util.Arrays;

public class Stack {
    private int[] stackArray;
    private int top;
    private int min;
    private java.util.Stack<Integer> minStack = new java.util.Stack<>();
    public Stack(int size){
        stackArray = new int[size];
        min = Integer.MAX_VALUE;
    }

    public void print(){
        System.out.println("Length: "+stackArray.length);
        System.out.println("Top: "+top);
        for(int i = 0; i < top; i++){
            System.out.println("["+i+"]: "+stackArray[i]);
        }
    }

    public void push(int item){
        if(top == stackArray.length){
            int[] temp = new int[top*2];
            for(int i = 0; i < stackArray.length; i++){
                temp[i] = stackArray[i];
            }
            stackArray = temp;
        }
        if(item < min){
            min = item;
            minStack.push(top);
        }
        stackArray[top++] = item;

    }

    public int pop(){
        if(top > 0){
            if(minStack.peek() == top-1){
                minStack.pop();
            }
            return stackArray[--top];
        }
        else {
            throw new IllegalStateException();
        }
    }
    public int peek(){
        if(top > 0){
            return stackArray[top-1];
        }
        else {
            throw new IllegalStateException();
        }
    }
    public boolean isEmpty(){
        return top == 0;
    }

    public int min(){
        System.out.print(minStack.toString());
        return stackArray[minStack.peek()];
    }

    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(stackArray,0,top);
        return Arrays.toString(content);
    }

    public static class StackQueue {
        private java.util.Stack<Integer> S1 = new java.util.Stack<>();
        private java.util.Stack<Integer> S2 = new java.util.Stack<>();

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
}
