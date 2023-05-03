package com.chidubem.Queues;

import java.util.*;

public class Solution {
 /**
             row
              |
 grid ==    ["1","1","0","0","0"] - column,
            ["1","1","0","0","0"],
            ["0","0","1","0","0"],
            ["0","0","0","1","1"] */

      /**   ["1","1","0","0","0"]
            ["1","1","0","0","0"],
            ["0","0","1","0","0"],
            ["0","0","0","1","1"] */



 private int row;
 private int col;

 public int numIslands(char[][] grid){

     row = grid.length;
     if (row == 0) return 0;
     col = grid[0].length;
     int islands = 0;

     for(int i=0; i<row; i++){
         for (int j=0; j<col; j++){
             if(grid[i][j] == 1){
                 sink(grid, i, j);
                 islands++;
             }
         }
     }
     return islands;
 }

    private void sink(char[][] grid, int i, int j) {
        if (i <0 || j< 0 || i >= row || j >= col || grid[i][j] != 1) return;
        grid[i][j] = '0';
        sink(grid, i+1, j);
        sink(grid, i-1, j);
        sink(grid, i, j-1);
        sink(grid, i, j+1);
    }


    /**OPEN THE LOCK */

    private static final String START = "0000";

    public int openLock(String[] deadends, String target ){
        if (target == null || target.length() == 0) return -1;
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();
        int level = 0;
        queue.offer(START);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i < size; i++){
                String currentLock = queue.poll();
                if (!visited.add(currentLock)) continue;
                if(currentLock.equals(target)) return level;

                for(String nextLock : getNextStates(currentLock)) {
                    if(!visited.contains(nextLock)) queue.offer(nextLock);
                }
            }
            level++;
        }
        return -1;
    }

    private List<String> getNextStates(String currentLock) {
        List<String> locks = new LinkedList<>();
        char[] arr = currentLock.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            arr[i] = c == '9' ? '0' : (char) (c + ((char) 1));
            locks.add(String.valueOf(arr));
            arr[i] = c == '0' ? '9' : (char) (c - ((char) 1));
            locks.add(String.valueOf(arr));
            arr[i] = c;
        }
        return locks;
    }

    public int numSquares(int n){
        int[] dp = new int[n +1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i =1; i<=n; ++i){
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i -j*j >= 0){
                min = Math.min(min, dp[i - j*j] + 1);
                ++j;
            }
            dp[i] = min;
        }
        return  dp[n];

    }


    public int squares(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        /**      1     1<=13  1++      */
        for(int i =1;  i<=n; i++){
            /**      1    1*1 <= 1   1++ */
            for (int j =1; j*j <=1; j++){
            /** dp[1] = Minimum -> (1, 0+1)*/
                dp[i] = Math.min(dp[i], dp[i- j*j] +1);
            }
        }
        return dp[n];
    }
}






