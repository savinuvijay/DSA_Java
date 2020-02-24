package com.dsajava;

import java.util.Arrays;

public class DoubleStack {
    private int[] stackArray;
    private int top1;
    private int top2;
    private int size;

    public DoubleStack(int size){
        stackArray = new int[size];
        top2 = size-1;
        this.size = size;
    }

    public void push1(int item) {
        if (top1 > top2) {
            throw new StackOverflowError();
        } else {
            stackArray[top1++] = item;
        }
    }
    public void push2(int item){
        if(top1 > top2){
            throw new StackOverflowError();
        }
        else{
            stackArray[top2--] = item;
        }
    }
    public int pop1(){
        if(isEmpty1()){
            throw new IllegalStateException();
        }
        else{
            return stackArray[--top1];
        }
    }

    public int pop2(){
        if(isEmpty2()){
            throw new IllegalStateException();
        }
        else{
            return stackArray[++top2];
        }
    }

    public boolean isEmpty1(){
        return top1 == 0;
    }

    public boolean isEmpty2(){
        return top1 == size-1;
    }

    @Override
    public String toString(){
        return Arrays.toString(stackArray);
    }
}
