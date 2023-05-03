package com.chidubem.thoughts;

import com.chidubem.Arrays.Lists.List;

import java.util.*;

class Data{
    private Object obj;

    public Data(Object obj){
        this.obj = obj;
    }

    public Object getObj(){
        return obj;
    }

    @Override
    public String toString() {
        return "Data [obj=" + obj + "]";
    }
}


public class App {

    public static void main(String[] args){
        Data data = new Data("some String");

        String variable = (String) data.getObj();
        System.out.println(variable);

        // HASHMAP
        HashMap<Integer, Integer> can = new HashMap<Integer, Integer>();
        can.put(2, 1);
        can.put(3, 2);
        can.put(4,3);
        can.put(5,1);
        can.put(1,3);

        for(int i : can.keySet()){
            System.out.println("\t" + i + "\t" + can.get(i));
        }


        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(12, "Leo");
        hash_map.put(2, "Seville");
        hash_map.put(7, "Lacy");
        hash_map.put(49, "Lily");
        hash_map.put(3, "Dillon");
        System.out.println("HashMap contents:");
        System.out.println("\tKEY\tVALUE");
        //display HashMap contents
        Set setIter =  hash_map.entrySet();
        Iterator map_iterator = setIter.iterator();
        while(map_iterator.hasNext()) {
            Map.Entry map_entry = (Map.Entry)map_iterator.next();
            System.out.println("\t"+ map_entry.getKey() + "\t" + map_entry.getValue());
        }

        //get value for the given key
        String var= hash_map.get(2);
        System.out.println("Value at index 2 is: "+var);

        //delete value given the key
        hash_map.remove(3);
        System.out.println("Hashmap after removal:");
        System.out.println("\tKEY\tVALUE");
        Set iter_set = hash_map.entrySet();
        Iterator iterator = iter_set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("\t"+mentry.getKey() + "\t" + mentry.getValue() );
        }


        // SORT HASHMAP BY KEYS
        //create and initialize a HashMap
        HashMap<Integer, String> colors_map = new HashMap<Integer, String>();
        colors_map.put(9, "Magenta");
        colors_map.put(11, "Yellow");
        colors_map.put(7, "Cyan");
        colors_map.put(23, "Brown");
        colors_map.put(5, "Blue");
        colors_map.put(3, "Green");
        colors_map.put(1, "Red");
        //print the unsorted HashMap by getting a set and using iterator
        System.out.println("Unsorted HashMap:");
        Set set = colors_map.entrySet();
        Iterator iterators = set.iterator();
        while(iterators.hasNext()){
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(colors_map);
        System.out.println("HashMap Sorted on keys:");
        //print the sorted HashMap
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}
