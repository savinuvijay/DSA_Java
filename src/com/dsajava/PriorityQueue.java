package com.dsajava;

import java.util.Arrays;

public class PriorityQueue {
    int[] items;
    int count;
    public PriorityQueue(int size){
        items = new int[size];
    }

    public void enqueue(int item){

        if(count< items.length) {
            int index = shiftItemsToInsert(item);
            items[index] = item;
            count++;
        }
        else{
            throw new IllegalStateException();
        }
    }

    private int shiftItemsToInsert(int item){
        int i;
        for (i = count - 1; i >= 0; i--){
            if(item < items[i]){
                items[i+1] = items[i];
            }
            else{
                break;
            }
        }
        return i + 1;
    }

    public int dequeue(){
        if(count >= 0) {
            return items[count--];
        }
        else {
            throw new IllegalStateException();
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
