package com.chidubem.thoughts;

public class fib {
    public static int fib_bottom_up(int n){
        if (n == 1 || n == 2) return 1;

       int[] bottom_up = new int[n +1];
       bottom_up[1] = 1;
       bottom_up[2] = 1;

       for (int i = 3; i < n+1; i++){
           bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
       }
       return bottom_up[n];
    }

    public static int  fib_it(int n){
        if( n < 2) return n;
        return fib_it(n-1) + fib_it(n-2);
    }

    //memoization
    public static int fib_memo(int n , int[] memo){
        if( n == memo[n]){
            return memo[n];
        }
        // if( memo[n] != 0) return memo[n];
        if (n <= 2) return n;
        memo[n] = fib_memo(n-1, memo) + fib_memo(n-1 , memo);
        return memo[n];

    }

    public static long[] fibonacciGood(int n){
        if(n <= 1){
            long[] answer = {n,0};
            return answer;
        }else {
            long[] temp = fibonacciGood(n-1);
            long[] answer = {temp[0] + temp[1] , temp[0]};
            return answer;
        }
    }

    public static boolean binarySearchIterative(int[] data, int target){
        int low = 0;
        int high = data.length-1;
        while( low <= high){
            int mid = (low + high)/2;
            if(target == data[mid]){
                return true;
            }else if(target < data[mid]){
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return false;
    }

    public static void reverseIterative(int[] data){
        int low =0, high = data.length-1;
        while(low < high){
            int temp = data[low];
            data[low++] = data[high];
            data[high--]= temp;
        }
    }

    public static void main(String[] args){
        int n = 50;
        int[] memo = new int[n +1];
//        System.out.println(fib_bottom_up(35));
//        System.out.println(fib_bottom_up(1000));
//        System.out.println(fib_bottom_up(10000));
        System.out.println(fib_memo(n, memo ));
    }
}
