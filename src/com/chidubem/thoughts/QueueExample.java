package com.chidubem.thoughts;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        double [] data = {34.4, 44.55,667.7,75.5,77.43, 13.45, 56.67};
//        for (int i = 0; i<5; i++){
//            q.add(i);
//        }
        q.add(11344959);
        q.add(88589393);
        q.add(38888949);
        q.add(49949992);

        System.out.println("Elements :" + q);

        int remove = q.remove();
        System.out.println("removed elements :" + remove );
        System.out.println("Elements :" + q.poll());
        System.out.println(sum(data));
        System.out.print("Java values: ");
        System.out.print(3.1416);
        System.out.print(',');
        System.out.print(15);
        System.out.println(" (double,char,int).");
    }
    public static double sum(double[] data){

        double total =0;
//        for (int i = 0; i< data.length; i++){
//            total += data[i];
//        }

        for (double val : data){
            total += val;
        }
        return total;
    }

    public static double max(double[] data){
        double currentMax = data[0];
        for (int j =1; j< data.length; j++){
            if (data[j] > currentMax)
                currentMax = data[j];
        }
        return currentMax;

    }
}
