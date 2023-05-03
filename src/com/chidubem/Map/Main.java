package com.chidubem.Map;

import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // initialize the hash set
        Set<Integer> hashSet = new HashSet<>();

        // add a new Key
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);

        hashSet.remove(2);

        if (!hashSet.contains(2)) {
            System.out.println("Key 2 is not in the hash set. ");
        }

        System.out.println("The size of has set is: " + hashSet.size());

        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }
        System.out.println("are in the hash set.");
        // 7. clear the hash set
        hashSet.clear();
        // 8. check if the hash set is empty
        if (hashSet.isEmpty()) {
            System.out.println("hash set is empty now!");
        }

        System.out.println(" ");


        // initialise the hashMap
        HashMap<Integer, String> colorsMap = new HashMap<Integer, String>();
        System.out.println("Initial Map: " +colorsMap);
        //put some initial values into it using put method
        colorsMap.put(100, "Red");
        colorsMap.put(101, "Green");
        colorsMap.put(102, "Blue");
        System.out.println("After adding elements:");
        for (Map.Entry m: colorsMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // HOW TO ITERATE A HASHMAP
        HashMap<Integer,String> cities_map = new HashMap<Integer, String>();
        cities_map.put(10, "MUM");
        cities_map.put(1, "DL");
        cities_map.put(20, "PUN");
        cities_map.put(7, "GOA");
        cities_map.put(3, "HYD");

        //print using for loop
        System.out.println("HashMap using for Loop:");
        System.out.println("\tKEY\tVALUE");

        for(Map.Entry mapSet : cities_map.entrySet()){
            System.out.println("\t"+ mapSet.getKey() + "\t" + mapSet.getValue());
        }

        System.out.println("HashMap using while Loop: ");
        System.out.println("\tKEY\tVALUE");

        Iterator iterator = cities_map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapSet2 = (Map.Entry) iterator.next();
            System.out.println("\t"+ mapSet2.getKey() + "\t" + mapSet2.getValue());
        }

        HashMap<String, Integer> colors = new HashMap<String, Integer>();
        colors.put("Red", 1);
        colors.put("Orange", 5);
        colors.put("Magenta", 8);
        //print the HashMap
        System.out.println("HashMap contents: ");
        System.out.println("\tKEY\tVALUE");
        for(String i : colors.keySet()){
            System.out.println("\t" + i + "\t" + colors.get(i));
        }



    }
}