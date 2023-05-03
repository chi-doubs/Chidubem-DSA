package com.chidubem.Arrays.Lists;

import javax.lang.model.element.Element;

public class ArrayList implements List {
    public static final int CAPACITY = 16;
    private Element[] data;
    private int size = 0;

    public ArrayList(){this(CAPACITY);}
    public ArrayList(int capacity){
        data = (Element[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Element get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        return data[i];
    }

    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
        if (i < 0 || i >= n)
            throw new IndexOutOfBoundsException("Illegal index: " + i);
    }

    @Override
    public Element set(int i, Element e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        Element temp = data[i];
        data[i] = e;
        return temp;
    }

    @Override
    public void add(int i, Element e) throws IndexOutOfBoundsException, IllegalStateException {
        checkIndex(i , size +1);
        if (size == data.length) throw new IllegalStateException("Array is full");
        for (int k = size-1; k >= i; k--)
            data[k+1] = data[k];
        data[i] = e;
        size++;

        if (size == data.length)
            resize(2 * data.length);
    }

    @Override
    public Element remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        Element temp = data[i];
        for (int k=i; k< size-1; k++)
            data[k] = data[k +1];
        data[size -1] = null;
        size--;
        return temp;
    }

    protected void resize(int capacity) {
        Element[] temp = (Element[]) new Object[capacity];

        for (int k =0; k < size; k++){
            temp[k] = data[k];
            data = temp;
        }
    }

    // Declaring without initializing
    int[][] intTwoD;

// Initializing an empty 2D array which has already been declared
   // intTwoD = new int[5][5];

    // Declaring and initializing an empty 2D array at once
   // String[][] stringData = new String[3][6];

    // Declaring and initializing a 2D array using initializer lists
  //  double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

    // Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
   // char[][] letters = new char[100][250];
  //  letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};
}



