package com.dsajava;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public LinkedList(){
        first = null;
        last = null;
    }

    public void print(){
        Node currentNode = first;
        int count = 0;
        if(!isEmpty(first)){
            do{
                System.out.println("["+ count++ +"]: "+currentNode.value);
                currentNode = currentNode.next;
            }while(currentNode != null);
        }
    }
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(!isEmpty(first)){
            newNode.next = first;
            first = newNode;
        }
        else{
            first = last = newNode;
        }
        size++;
    }
    public void addLast(int value){
        Node newNode = new Node(value);
        if(!isEmpty(first)){
            last.next = newNode;
            last = newNode;
        }
        else{
            first = last = newNode;
        }
        size++;
    }
    public void deleteFirst(){
        if(first == last){
            first = last = null;
        }
        if(!isEmpty(first)){
            Node temp = first;
            first = temp.next;
            temp.next = null;
        }
        else{
            throw new NoSuchElementException();
        }
        size--;
    }
    public void deleteLast(){
        if(!isEmpty(first)) {
            Node previousNode = getPrevious(last);
            if(previousNode == null){
                first = last = null;
            }
            else{
                last = previousNode;
                last.next = null;
            }
        }
        else{
            throw new NoSuchElementException();
        }
        size--;
    }
    public int indexOf(int value){
        Node currentNode = first;
        int count = 0;
        if(!isEmpty(first)){
            do{
                if(currentNode.value == value) return count;
                count++;
                currentNode = currentNode.next;
            }while(currentNode != null);
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1 ? true: false;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node currentNode = first;
        int index = 0;
        while(currentNode != null){
            array[index++] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public void reverse(){
        if(isEmpty(first)) return;
        last = first;
        Node prev = null;
        Node current = first;
        Node next = current.next;
        while(current.next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        first = current;
    }

    public int kthNodeFromLast(int k){
        if(!isEmpty(first)){
            Node P1 = first;
            Node P2 = first;
            for(int i = 0 ; i < k-1; i++){
                if(P2!= null){
                    P2 = P2.next;
                }
                else throw new IllegalArgumentException();
            }
            while(P2 != last){
                P1 = P1.next;
                P2 = P2.next;
            }
            return P1.value;
        }
        else throw new IllegalStateException();
    }

    public void printMiddle(){
        if(!isEmpty(first)) {
            Node P1 = first;
            Node P2 = first;
            while (P2 != last && P2.next != last) {
                P2 = P2.next.next;
                P1 = P1.next;
            }
            if(P2 == last){
                System.out.println("->["+P1.value+"]<-");
            }
            else{
                System.out.println("->["+P1.value+","+P1.next.value+"]<-");
            }
        }
        else{
            throw new IllegalStateException();
        }
    }

    public boolean hasLoop(){
        Node P1 = first;
        Node P2 = first;
        while (P2 != null && P2.next != null){
            P2 = P2.next.next;
            P1 = P1.next;
            if(P1 == P2) return true;
        }
        return false;
    }

    public void addLoop(){
        last.next = first.next.next;
    }

    private boolean isEmpty(Node first){
        return first == null ? true : false;
    }

    private Node getPrevious(Node lastNode){
        Node currentNode = first;
        while(currentNode != null){
            if(currentNode.next == lastNode) return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }
}
