package com.chidubem.thoughts;

public class TestBinarySearch {

    public static void main(String[] args) {
	// write your code here
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
        print(a);
        System.out.println("search(a, 44):" + search(a, 44));
        System.out.println("search(a, 50):" + search(a, 50));
        System.out.println("search(a, 77):" + search(a, 77));
        System.out.println("search(a, 86):" + search(a, 86));
    }

    private static void print(int[] a) {
        System.out.printf("%d", a[0]);
        for(int i = 1; i< a.length; i++){
            System.out.printf("%d", a[i]);
        }
        System.out.println("}");
    }

    public static int search(int [] a , int x){
        return search(a, 0,a.length-1, x);
    }

    public static int search(int []a , int lo , int hi, int x) {
        if (lo > hi) {
            return -1;
        }

        int i = (lo + hi) / 2;

        if (a[i] == x) {
            return i;
        } else if (a[i] < x) {
            return search(a, i + 1, hi, x);
        } else if (a[i] > x) {
            return search(a, lo, i - 1, x);
        }
        return -1;
    }
}
