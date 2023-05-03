package com.chidubem.Recursion;

public class Solution {
    public static void drawRuler(int nInches, int majorLength){
        drawLine(majorLength, 0);
        for (int j = 1; j<= nInches; j++){
            drawInterval(majorLength -1);
            drawLine(majorLength , j);
        }
    }

    private static void drawInterval(int centralLength ) {
        if (centralLength >= 1){
            drawInterval(centralLength -1);
            drawLine(centralLength);
            drawInterval(centralLength -1);
        }
    }



    private static void drawLine(int tickLength, int tickLabel) {
        for( int j =0;  j < tickLength; j++)
            System.out.print("-");
         if(tickLabel >= 0)
             System.out.print(" " + tickLabel);
             System.out.print("\n");
    }

    private static void drawLine(int tickLength){
        drawLine(tickLength, -1);
    }

    // Binary Search
    public static boolean binarySearch(int[] data, int target, int low, int high){
        if (low > high)
            return false;
        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return true;
            else if( target < data[mid])
                return binarySearch(data , target, low, mid -1);
            else
                return binarySearch(data, target, mid + 1, high);
        }

    }


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        if(image[sr][sc] == newColor)  return image;
      bloat( image,sr, sc, image[sr][sc] ,  newColor);
        return image;
    }


    private void bloat(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr <0 || sc <0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) return;
        image[sr][sc] = newColor;
        bloat(image , sr +1, sc, color, newColor);
        bloat(image , sr -1, sc, color, newColor);
        bloat(image , sr , sc+1, color, newColor);
        bloat(image , sr , sc-1, color, newColor);

    }



    public static void main(String [] args){
       drawRuler(5, 2);

        /** how to use a random() method */
        double a = Math.random() * 10;

        int b = (int)(Math.random() * 10);

    }
}
