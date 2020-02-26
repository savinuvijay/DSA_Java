package com.dsajava;

import java.util.*;
import java.util.Stack;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");

        */
        // ---- Arrays ----
        /*
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(40);
        numbers.insert(30);
        numbers.insert(20);
        numbers.removeAt(2);
        numbers.print();
        System.out.println("Index of 20: "+numbers.indexOf(20));
        System.out.println("Max of Array: "+numbers.max());

        Array numbers2 = new Array(4);
        numbers2.insert(10);
        numbers2.insert(50);
        numbers2.insert(30);
        numbers2.insert(20);
        numbers2.print();

        System.out.println("Intersect");
        Array intersection = numbers.intersect(numbers2);
        intersection.print();

        System.out.println("Reverse");
        numbers2.reverse();
        numbers2.print();

        System.out.println("Insert At1");
        numbers2.insertAt(70,2);
        numbers2.print();

        System.out.println("Insert At2");
        numbers2.insertAt(90,5);
        numbers2.print();

         */
        // ---- Linked Lists ----
        /*
        LinkedList list = new LinkedList();
        System.out.println("Size: "+ list.size());
        list.addFirst(10);
        list.addFirst(20);
        System.out.println("Size: "+ list.size());
        list.addFirst(30);
        list.addFirst(35);

        int[] array = list.toArray();
        System.out.println("To Array: "+ Arrays.toString(array));

        list.reverse();

        array = list.toArray();
        System.out.println("Reverse To Array: "+ Arrays.toString(array));
        list.printMiddle();
        list.print();
        System.out.println("-------");
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        System.out.println("Size: "+ list.size());
        list.print();

        list.printMiddle();

        System.out.println("1th Node Form last: "+ list.kthNodeFromLast(1));

        System.out.println("-------");
        list.deleteFirst();
        System.out.println("Size: "+ list.size());
        list.deleteFirst();
        list.print();
        System.out.println("-------");
        list.deleteLast();
        list.deleteLast();
        System.out.println("Size: "+ list.size());
        list.print();
        System.out.println("-------");

        System.out.println("Contains 40: "+ list.contains(40));
        System.out.println("Index of 50: "+ list.indexOf(50));

        LinkedList list2 = new LinkedList();
        list2.addFirst(10);
        list2.addFirst(20);
        list2.addFirst(30);
        list2.addFirst(35);

        list2.addLoop();

        System.out.println(list2.hasLoop());

         */
        // ---- Stacks ----
        /*
        StringReverser sr = new StringReverser();
        System.out.println(sr.reverse("abcd"));

        Expression exp = new Expression();
        System.out.println(exp.isBalanced("(1+2)"));

        Stack stack = new Stack(4);
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.push(1);
        System.out.println(stack.toString());
        stack.print();
        System.out.println("Min: " + stack.min());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Min: " + stack.min());
        //System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Peek: " + stack.peek());

        DoubleStack doubleStack = new DoubleStack(10);
        doubleStack.push1(10);
        doubleStack.push1(20);
        doubleStack.push2(30);
        doubleStack.push2(40);
        doubleStack.pop1();
        doubleStack.push1(50);
        doubleStack.pop2();
        doubleStack.push2(60);
        System.out.println(doubleStack.toString());

         */
        // ---- Queues ----
        /*
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseUsingStack(queue);
        System.out.println(queue);

        reverseUsingQueue(queue);

        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        System.out.println(arrayQueue.toString());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.toString());
        arrayQueue.enqueue(60);
        arrayQueue.enqueue(70);
        //arrayQueue.enqueue(80);
        System.out.println(arrayQueue.toString());

        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);
        System.out.println(stackQueue.dequeue());

        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.enqueue(3);
        System.out.println(priorityQueue.toString());
        priorityQueue.enqueue(1);
        System.out.println(priorityQueue.toString());
        priorityQueue.enqueue(5);
        System.out.println(priorityQueue.toString());
        priorityQueue.enqueue(2);
        System.out.println(priorityQueue.toString());

        Queue<Integer> queue1 = new ArrayDeque<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        queue1.add(50);

        System.out.println(queue1);

        queue1 = reverseKItemsInQueue(queue1,3);

        System.out.println(queue1);

        LinkedListQueue llq = new LinkedListQueue();
        llq.enqueue(10);
        llq.enqueue(20);
        llq.enqueue(30);
        System.out.println(llq.toString());
        System.out.println(llq.dequeue());
        System.out.println(llq.toString());
        System.out.println(llq.peek());

        QueueStack qs = new QueueStack();
        qs.push(10);
        qs.push(20);
        qs.push(30);
        System.out.println(qs.pop());
        qs.push(40);
        System.out.println(qs.peek());

         */
        System.out.println(firstNonRepeatingCharacter("a green apple"));
    }

    public static char firstNonRepeatingCharacter(String string){
        Map<Character,Integer> hash = new HashMap<>();
        for(char ch: string.toCharArray()){
            if(!hash.containsKey(ch)){
                hash.put(ch,1);
            }
            else{
                int count = hash.get(ch);
                hash.put(ch,++count);
            }
        }
        for(char ch: string.toCharArray()){
            if(hash.containsKey(ch)){
                if(hash.get(ch) == 1) return ch;
            }
        }
        //System.out.println(hash);
        return ' ';
    }

    public static void reverseUsingQueue(Queue<Integer> queue){
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        while(!queue.isEmpty()){
            queue1.add(queue.remove());
            while(!queue2.isEmpty()){
                queue1.add(queue2.remove());
            }
            while (!queue1.isEmpty()){
                queue2.add(queue1.remove());
            }
        }
        System.out.println(queue2);
    }

    public static void reverseUsingStack(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }

    public static Queue<Integer> reverseKItemsInQueue(Queue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> tempQueue = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            stack.push(queue.remove());
        }
        while(!queue.isEmpty()){
            tempQueue.add(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        while(!tempQueue.isEmpty()){
            queue.add(tempQueue.remove());
        }
        return queue;
    }

}
