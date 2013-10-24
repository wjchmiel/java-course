package com.chmielowiec.lecture53;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class App {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        // Not guarantee any particular order
        System.out.println("Testing HashMap");
        testMap(hashMap);

        // Maintain the order you put things in
        System.out.println("Testing LinkedHashMap");
        testMap(linkedHashMap);

        // Keys sorted in natural order
        System.out.println("Testing TreeMap");
        testMap(treeMap);


    }


    public static void testMap(Map<Integer, String> map) {

        map.put(5, "Five");
        map.put(6, "Six");
        map.put(44, "Five");
        map.put(4, "Four");
        map.put(3, "Three");
        map.put(20, "Twenty");
        map.put(10, "Ten");

            /*
            for (Map.Entry<Integer, String> entry: map.entrySet()){
                int key = entry.getKey();
                String value = entry.getValue();

                System.out.println(key + ": " + value);
            }
            */

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }


}
