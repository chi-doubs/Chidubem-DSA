package com.chidubem.Arrays;

public class insertionSort {
//    public static void Sort(char[] data){
//        int n = data.length;
//        for(int k = 1; k < n; k++){
//            char cur = data[k];
//            int j = k;
//
//            while(j>0 && data[j - 1] > cur){
//                data[j] = data[j-1];
//                j--;
//            }
//            data[j] = cur;
//        }
//    }
//
//
////∗ Returns true if there are no duplicate elements in the array. ∗/
//          public static boolean unique1(int[ ] data) {
//          int n = data.length;
//          for (int j=0; j < n−1; j++)
//          for (int k=j+1; k < n; k++)
//            if (data[j] == data[k])
//             return false; // found duplicate pair
//         return true; // if we reach this, elements are unique
//         }
//
         public static double[] prefixAverage(double[] x){
        int n = x.length;
        double[] a = new double[n];
        for (int j = 0; j<n; j++){
            double total = 0;
            for (int i =0; i<= j; i++)
                total += x[i];
            a[j] = total / (j+1);
        }
        return a;
         }
    public static void main(String [] args){
//           int [] packet = {23, 45, 56, 34, 45, 76, 11, 32};
//           insertionSort.Sort('');
      double []square = {12,44,55,33};

        System.out.println(prefixAverage(square));
    }
}
