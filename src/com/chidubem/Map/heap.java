package com.chidubem.Map;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class heap {

    public static void main(String[]args){
        Queue<Integer> logic = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });

        Queue<Integer> pq = new PriorityQueue<>(logic);
        pq.add(1);
        pq.add(2);
        pq.add(0);

        System.out.println("max element -> " + pq.peek());
        pq.remove();
        System.out.println("max element -> " + pq.peek());

    }
}

