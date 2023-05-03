package com.chidubem.Recursion;

public class Examples {

    /**    Summing the Elements of an Array Recursively  */
    public static int linearSum(int[] data, int n){
        if (n==0) return 0;
        else
            return linearSum(data, n-1) + data[n-1];
    }

    /**  Reversing a Sequence with Recursion  */
    public static void reverseArray(int[] data, int low, int high){
        if (low< high){
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low +1, high-1);
        }
    }

    /** Recursive Algorithms for Computing Powers */
    public static double power(double x, int n){
        if (n==0)  return 1;
        else
            return x* power(x, n-1);
    }

    /** recursive implementation */
    public static double Power(double x, int n){
        if ( n==0) return 1;
        else {
            double partial = Power(x, n/2);
            double result = partial * partial;
            if (n% 2 == 1)
                result *= x;
            return result;
        }
    }

    public static int binarySum(int[] data, int low, int high){
        if(low > high) return  0;
        else if (low == high) return data[low];
        else {
            int mid = (low + high) / 2;
            return  binarySum(data,low,mid) + binarySum(data, mid+1, high);
        }
    }



    public static void main(String [] args){


    }
}
