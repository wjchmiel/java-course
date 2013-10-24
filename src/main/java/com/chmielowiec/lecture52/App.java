package com.chmielowiec.lecture52;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }

    public static void doTimings(String type, List<Integer> list) {


        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        int size = list.size();

        long start = System.currentTimeMillis();

        /*
        // Add items at the end of list
        for (int j = size; j < size + 1E5; j++){
            list.add(j);
        }
        */

        // Add items elsewhere in list
        for (int j = 0; j < 1E5; j++) {
            list.add(0, j);
        }

        long end = System.currentTimeMillis();

        System.out.println("Size of list: " + list.size());
        System.out.println("Time taken: " + (end - start) + "ms for " + type);

    }

}
