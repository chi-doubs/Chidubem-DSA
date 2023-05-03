package com.chidubem.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeeksCode {

    /** Using HASH MAP*/
    public static int findSubArraySum(int arr[], int n, int sum){

        // HashMap to store number of subarrays
        // starting from index zero having
        // particular value of sum.
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);
        int res = 0;

        //sum of elements so far.
        int currSum = 0;

        for (int i =0; i < n; i++){
            currSum += arr[i];

            int  removeSum = currSum - sum;

            if (prevSum.containsKey(removeSum))
                res += prevSum.get(removeSum);

            prevSum.put(currSum, prevSum.getOrDefault(currSum, 0)+1);
        }
        return res;
    }

    public static void main(String[] args){

        int arr[] = { 10, 2, -2, -20, 10};  int k = -10;
        int n = arr.length;
        int res =0;

        List<Integer> core = new ArrayList<>();


        for (int i = 0; i<n; i++){
            int sum = 0;
            for (int j = i; j<n; j++) {
                sum += arr[j];

                if (sum == k){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

// prev = null;
//         return inorder(root);
//         }
//
//private boolean inorder(TreeNode root){
//        if(root == null) return true;
//
//        if(!inorder(root.left)) return false;
//
//        if(prev != null && root.val <= prev) return false;
//
//        prev = root.val;
//        return inorder(root.right);


//return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
//        }
//
//private boolean helper(TreeNode root, long min, long max) {
//        if (root == null)
//        return true;
//        if (root.val <= min || root.val >= max)
//        return false;
//        return helper(root.left, min, root.val) && helper(root.right, root.val, max);

/**
 Deque<TreeNode> stack = new ArrayDeque<>();
 Integer prev = null;

 while (!stack.isEmpty() || root != null) {
 while (root != null) {
 stack.push(root);
 root = root.left;
 }
 root = stack.pop();
 // If next element in inorder traversal
 // is smaller than the previous one
 // that's not BST.
 if (prev != null && root.val <= prev) {
 return false;
 }
 prev = root.val;
 root = root.right;
 }
 return true;

 */

  

  //           { 10, 2, -2, -20, 10}

