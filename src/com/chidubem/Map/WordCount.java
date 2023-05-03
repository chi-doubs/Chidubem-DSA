package com.chidubem.Map;

import com.chidubem.priorityQueue.Entry;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args){
        Map<String, Integer> freq = new HashMap<>();
        Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
        while (doc.hasNext()){
            String word = doc.next().toLowerCase();
            Integer count = freq.get(word);
            if (count == null)
                count = 0;
            freq.put(word, 1+count);
        }
        int maxCount = 0;
        String maxWord = "no word";
        for (Map.Entry<String, Integer> ent : freq.entrySet())
            if (ent.getValue() > maxCount){
                maxCount = ent.getValue();
                maxWord = ent.getKey();
            }
//        System.out.println("The rest of the implementation is rather simple. One subtlety worth mentioning\n" +
//                "is the way in which we remove an entry from the array list. Although we could use\n" +
//                "the remove method of the ArrayList class, that would result in an unnecessary loop\n" +
//                "to shift all subsequent entries to the left. Because the map is unordered, we prefer\n" +
//                "to fill the vacated cell of the array by relocating the last entry to that location. Such\n" +
//                "an update step runs in constant time"
//        );
        System.out.print("The most frequent word is ' " + maxWord);
            System.out.println("' with " + maxCount + " occurrences. ");
    }
}
