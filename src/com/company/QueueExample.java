package com.company;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueExample {
    public static void main(String args[]){
        Queue<String> addQueue=new PriorityQueue<>();
        addQueue.add("b");
        addQueue.add("a");
        addQueue.offer("n");

        System.out.println(addQueue.poll());

        System.out.println(addQueue.poll());

        System.out.println(addQueue.element());
    }
}
