package com.chidubem.Arrays.Lists;

import javax.lang.model.element.Element;

public interface List {

    int size();
    boolean isEmpty();
    Element get(int i) throws IndexOutOfBoundsException;
    Element set(int i , Element e) throws IndexOutOfBoundsException;
    public void add(int i, Element e) throws IndexOutOfBoundsException;
    Element remove(int i) throws IndexOutOfBoundsException;
}

