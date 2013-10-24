package com.chmielowiec.lecture60;

import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");


        Iterator<String> iterator = animals.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);

            if (value.equals("cat"))
                iterator.remove();
        }

        System.out.println();

        System.out.println(animals);


        /// Modern iteration, Java 5 and later

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
