package com.chidubem.Map;

import com.chidubem.priorityQueue.Entry;

public interface Map<K,V> {
    int size();
    boolean isEmpty();
    V get(K key);
    V put(K key, V value);
    V remove(K Key);
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<Entry<K,V>> entrySet();
}
