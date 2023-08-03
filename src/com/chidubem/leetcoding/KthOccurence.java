package com.chidubem.leetcoding;

import com.chidubem.Arrays.Lists.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Occurrence {

    public static int[] KthOccurrence(int[] arr, int x, int[] queries){
        HashMap<Integer, ArrayList> hashMap = new HashMap<Integer, ArrayList>();

        for(int i = 0; i <arr.length; i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], new ArrayList());
            }
            hashMap.get(arr[i]).add(i+1);
        }

        int[] index = new int[queries.length];
        ArrayList key = hashMap.get(x);
        System.out.println(key);
        for(int j =0; j< queries.length; j++) {
            if (key.size() < queries[j] ) {
                index[j] = -1;
            } else {
                index[j] = (int) key.get(queries[j]-1);
            }
        }
    return index;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 20, 8, 8, 1, 2, 5,8,0};
        int x = 8;
        int[] queries = {100, 4, 2};

        int[] index = KthOccurrence(arr, x, queries);
        System.out.println(Arrays.toString(index));
    }
}
