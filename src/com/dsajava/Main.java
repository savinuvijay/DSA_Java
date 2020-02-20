package com.dsajava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
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

    }
}
