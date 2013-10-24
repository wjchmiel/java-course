package com.chmielowiec.lecture59;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class App {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);

        queue1.add(10);
        queue1.add(20);
        queue1.add(30);

        System.out.println("Head of the queue is: " + queue1.element());

        try {
            queue1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue.");
        }

        for (Integer value : queue1) {
            System.out.println("Queue 1 value: " + value);
        }


        System.out.println("Removed form queue: " + queue1.remove());
        System.out.println("Removed form queue: " + queue1.remove());
        System.out.println("Removed form queue: " + queue1.remove());

        try {
            System.out.println("Removed form queue: " + queue1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to removed too many items form the queue.");
        }

        System.out.println();
        //////////////////////////////////////////////////////////////////////

        Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("Queue 2 peak: " + queue2.peek());

        queue2.offer(10);
        queue2.offer(20);

        System.out.println("Queue 2 peak: " + queue2.peek());

        if (queue2.offer(30) == false)
            System.out.println("Offer failed to add third item.");

        System.out.println("Queue 2 poll: " + queue2.poll());
        System.out.println("Queue 2 poll: " + queue2.poll());
        System.out.println("Queue 2 poll: " + queue2.peek());


    }
}
