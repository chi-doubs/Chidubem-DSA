package com.chidubem.Queues;

import javax.swing.text.Element;

public interface Deque {
    int size();
    boolean isEmpty();
    Element first();
    Element last();
    void addFirst(Element e);
    void addLast(Element e);
    Element removeFirst();
    Element removeLast();
}
