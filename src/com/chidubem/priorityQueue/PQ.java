package com.chidubem.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
    private static void testStringsNaturalOrdering(){
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings stored in Natural Ordering in a Priority Queue\n");
        while (!testStringsPQ.isEmpty()){
            System.out.println(testStringsPQ.poll());
        }
    }

    static class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
    }



    public static void main(String[] args) {
        Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        System.out.println("Integers stored in reverse order of priority in a Priority Queue\n");
        while (!testIntegersPQ.isEmpty()){
            System.out.println(testIntegersPQ.poll());
        }
    }
}
