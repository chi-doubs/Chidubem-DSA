package com.chidubem.priorityQueue;


import java.util.Comparator;

// K-key, V-value
public interface Entry<K,V> {
    K getKey();  // returns the key stored in this entry
    V getValue(); // returns the value stored in this entry
}

interface PriorityQueue<K,V>{
    int size();
    boolean isEmpty();
    Entry<K,V> insert(K key, V value) throws  IllegalArgumentException;
    Entry<K,V> min();
    Entry<K,V> removeMin();
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (a.length() < b.length()) return -1;
        else if (a.length() == b.length()) return 0;
        return 1;
    }
}

class DefaultComparator<E> implements Comparator<E>{
    public int compare(E a, E b) throws ClassCastException{
        return ((Comparable<E>)a).compareTo(b);
    }
}

abstract class AbstractPriorityQueue<K,V> implements  PriorityQueue<K,V> {

    protected static class PQEntry<K,V> implements Entry<K,V>{
        private K k; // key
        private V v; // value

        public PQEntry(K key, V value){
            k = key;
            v = value;
        }

        public K getKey() { return k; }
        public V getValue() { return v; }

        protected void setKey(K key){ k = key;}
        protected void setValue(V value){ v = value;}
    }

    private Comparator<K> comp;
    protected AbstractPriorityQueue(Comparator<K> c){comp = c;}
    protected AbstractPriorityQueue() {this(new DefaultComparator<>());}
    protected int compare(Entry<K,V> a, Entry<K,V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    protected boolean checkKey(K key)  throws IllegalArgumentException{
        try{
            return (comp.compare(key, key)== 0);
        }catch (ClassCastException e){
            throw new IllegalArgumentException("Incompatible key");
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }
}