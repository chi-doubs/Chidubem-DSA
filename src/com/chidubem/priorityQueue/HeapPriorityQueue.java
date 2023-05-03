//package com.chidubem.priorityQueue;
//
//import com.chidubem.Arrays.Lists.ArrayList;
//
//import java.util.Comparator;
//
//public class HeapPriorityQueue<K, V> extends AbstractPriorityQueue<K,V> {
//
//    protected ArrayList<Entry<K,V>> heap = new ArrayList<>();
//
//    public HeapPriorityQueue() { super(); }
//
//    public HeapPriorityQueue(Comparator<K> comp) { super(comp);}
//
//    protected int parent(int j) { return (j-1)/ 2;}
//    protected int left(int j){ return 2*j +1;}
//    protected int right(int j) {return  2*j +2;}
//    protected boolean hasLeft(int j) {return left(j) < heap.size();}
//    protected boolean hasRight(int j) {return right(j) < heap.size();}
//
//    protected void swap(int i, int j){
//        Entry<K,V> temp =  heap.get(i);
//        heap.set(i, heap.get(j));
//        heap.set(j, temp);
//    }
//
//    protected void upheap(int j) {
//         while (j > 0) { // continue until reaching root (or break statement)
//             int p = parent(j);
//             if (compare(heap.get(j), heap.get(p)) >= 0) break; // heap property verified
//             swap(j, p);
//             j = p; // continue from the parent's location
//            }
//         }
//
//
//    protected void downheap(int j) {
//         while (hasLeft(j)) { // continue to bottom (or break statement)
//             int leftIndex = left(j);
//             int smallChildIndex = leftIndex; // although right may be smaller
//             if (hasRight(j)) {
//                 int rightIndex = right(j);
//                 if (compare(heap.get(leftIndex), heap.get(rightIndex)) > 0)
//                     smallChildIndex = rightIndex; // right child is smaller
//                 }
//             if (compare(heap.get(smallChildIndex), heap.get(j)) >= 0)
//                 break; // heap property has been restored
//             swap(j, smallChildIndex);
//             j = smallChildIndex; // continue at position of the child
//             }
//         }
//
//
//
//    @Override
//    public int size() {
//        return heap.size();
//    }
//
//    @Override
//    public Entry<K, V> insert(K key, V value)  {
//        if (heap.isEmpty())
//        return null;
//
//        return heap.get(0);
//    }
//
//    @Override
//    public Entry<K, V> min() {
//        return null;
//    }
//
//    @Override
//    public Entry<K, V> removeMin() {
//        return null;
//    }
//}
