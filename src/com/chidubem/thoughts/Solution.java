package com.chidubem.thoughts;


import com.chidubem.Arrays.Lists.PositionalList;
import com.chidubem.Trees.TreeNode;
import javafx.util.Pair;

import java.util.*;

public class Solution {

   public static int minMoves2(int[] nums) {
      int len = nums.length;
      int i = 0;
      int count = 0;

      Arrays.sort(nums);

      while (i < len) {
         // for(int i = 0; i<= len; i++){
         int mid = len / 2;
         if (nums[i] < nums[mid]) {
            nums[i] += 1;
            count++;
         } else if (nums[i] > nums[mid]) {
            nums[i] -= 1;
            count++;
         } else {
            i++;
         }
      }
      return count;
   }


   public int[] dailyTemperatures(int[] temperatures) {
      Stack<Integer> stack = new Stack<>();
      int[] ret = new int[temperatures.length];
      for (int i = 0; i < temperatures.length; i++) {
         while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            int idx = stack.pop();
            ret[idx] = i - idx;
         }
         stack.push(i);
      }
      return ret;
   }


   public int kthSmallest(int[][] matrix, int k) {
      int lo = matrix[0][0];
      int hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;//[lo, hi)
      while (lo < hi) {
         int mid = lo + (hi - lo) / 2;
         int count = 0, j = matrix[0].length - 1;
         for (int i = 0; i < matrix.length; i++) {
            while (j >= 0 && matrix[i][j] > mid) j--;
            count += (j + 1);
         }
         if (count < k) lo = mid + 1;
         else hi = mid;
      }
      return lo;
   }


   public int[] Temperatures(int[] temp) {
      int[] stack = new int[temp.length];
      int top = -1;
      int[] ret = new int[temp.length];
      for (int i = 0; i < temp.length; i++) {
         while (top > -1 && temp[i] > temp[stack[top]]) {
            int idx = stack[top--];
            ret[idx] = i - idx;
         }
         stack[++top] = i;
      }
      return ret;
   }

   /**
    * Input: tokens = ["2","1","+","3","*"]
    * Output: 9
    * Explanation: ((2 + 1) * 3) = 9
    * <p>
    * ["4","13","5","/","+"]
    */

   public int evalRPN(String[] tokens) {
      int a, b;
      Stack<Integer> S = new Stack<Integer>();
      for (String s : tokens) {
         if (s.equals("+")) {
            S.add(S.pop() + S.pop());
         } else if (s.equals("/")) {
            b = S.pop();
            a = S.pop();
            S.add(a / b);
         } else if (s.equals("*")) {
            S.add(S.pop() * S.pop());
         } else if (s.equals("-")) {
            b = S.pop();
            a = S.pop();
            S.add(a - b);
         } else {
            S.add(Integer.parseInt(s));
         }
      }
      return S.pop();
   }


   /**
    * DFS using Recursion
    */
   /*
    * Return true if there is a path from cur to target.
    */

 //  Definition for a Node.
   class Node{
      public int val;
      public List<Node> neighbours;
      public Node(){
         val = 0;
         neighbours = new ArrayList<Node>();
      }

      public Node(int _val){
         val = _val;
         neighbours = new ArrayList<Node>();
      }

      public Node(int _val, ArrayList<Node> _neighbours){
         val = _val;
         neighbours = _neighbours;
      }
   }


   public void dfs(Node node, Node copy, Node[] visited){
      visited[copy.val] = copy;

      for(Node n : node.neighbours){
         if (visited[n.val] == null){
            Node newNode = new Node(n.val);
            copy.neighbours.add(newNode);
            dfs(n , newNode, visited);
         } else{
            copy.neighbours.add(visited[n.val]);
         }
      }
   }


   public Node cloneGraph(Node node){

      if(node == null) return null;
      Node copy = new Node(node.val);
      Node[] visited = new Node[101];
      Arrays.fill(visited , null);
      dfs(node , copy, visited);
      return copy;
   }

   boolean DFS(int root, int target){
      Set<Node> visited = new HashSet<Node>();
      Stack<Node> stack = new Stack<>();
      Node ruth = new Node(root);
      stack.push(ruth);

      while(!stack.isEmpty()){
          Node cur = stack.pop();
          stack.pop();
          if (cur.val == target) return true;
          for (Node next: cur.neighbours){
             if (!visited.contains(next)){
                visited.add(next);
                stack.add(next);
             }
          }
      }
      return false;

   }


   // 1457. Pseudo-Palindromic Paths in a Binary Tree
   public boolean checkPalindrome(ArrayList<Integer> nums){
      int isPalindrom = 0;

      for (int i = 1; i < 10 ; ++i){
         if (Collections.frequency(nums, i) % 2 == 1) {
            ++ isPalindrom;
            if (isPalindrom > 1){
               return false;
            }
         }
      }
      return true;
   }

//   public int pseudoPalindromicPaths(TreeNode root){
//      int count = 0, path =0;
//
//      Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>();
//      stack.push(new Pair<>());
//
//
//      return count;
//   }
//
//   public static <E> void pqSort(PositionalList S, PriorityQueue P ){
//      int n = S.size();
//      for (int j =0; j<n; j++){
//         E element = S.remove(S.first());
//         P.insert(element, null);
//      }
//      for (int j =0; j<n; j++){
//         E element = P.removeMin().getKey();
//         S.addLast(element);
//      }
//
//   }
//
}

 /** adjList = [[2,4],[1,3],[2,4],[1,3]] */