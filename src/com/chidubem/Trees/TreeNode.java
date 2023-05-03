package com.chidubem.Trees;

import javax.swing.text.Position;
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){ this.val = val;}

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution{

    /** Recursive Solution */
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root != null){
            helper(root.left, res);
            res.add(root.val);
            helper(root.right , res);
        }
    }


    private void preorderSubTree(TreeNode p, List<Integer> res){
        res.add(p.val);
    }


   /** Approach 2: Iterating method using Stack */
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr=  curr.right;
        }

        return res;
    }

    private Iterable<Integer> preorder(){
        List<Integer> snapshot = new ArrayList<>();
        if (!snapshot.isEmpty()){
            preorderSubTree(root(), snapshot);
        }
        return snapshot;
    }

    public void postorderSubtree( int p , List<Integer> res){
        for(int c : res){
            postorderSubtree(c, res);
        }
        res.add(p);
    }
    private Iterable<Integer> postorder(){
        List<Integer> snapshot = new ArrayList<>();
        if (!snapshot.isEmpty()){
            postorderSubtree(2, snapshot);
        }
        return snapshot;
    }

    public Iterable<Integer> breadthFirst(){
        List<Integer> snapShot = new ArrayList<>();
        if (!snapShot.isEmpty()){
            Queue<TreeNode> fringe = new LinkedList<>();
            fringe.add(root());
            while (!fringe.isEmpty()){
                TreeNode p = fringe.remove();
                snapShot.add(p.val);
                for(Integer c :  snapShot){

                }
            }
        }
        return snapShot;
    }

    private static  int layout(BinaryTree T, Position p , int d, int x){
        if (T.left(p) != null){
            x = layout(T, T.left(p), d +1, x);
        }
      /**  p.getElement().setX(x++); // post-increment x
           p.getElement().setY(d);
       */
      if (T.right(p) != null)
          x = layout(T, T.right(p) , d+1, x);
      return x;
    }
    private TreeNode root() {
        return root();
    }



    /** Validate Binary Search Tree */
    
}