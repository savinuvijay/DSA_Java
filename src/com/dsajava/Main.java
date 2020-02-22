package com.dsajava;

import java.util.Arrays;

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

        StringReverser sr = new StringReverser();
        System.out.println(sr.reverse("abcd"));
    }
}
