package com.company.algorithms2021;

import java.util.PriorityQueue;

public class Queue {

    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>();

        q.offer("first"); // Adding to the PriorityQueue w/ offer() method
        q.offer("second");
        q.offer("third");

//        System.out.printf("%s ", q);
//        System.out.println();
//
//        System.out.printf("%s ", q.peek()); // peek() returns the highest priority
//        System.out.println();
//
//        q.poll(); // removes the duplicate elements in the list
//        System.out.printf("%s ", q);


    }
}
