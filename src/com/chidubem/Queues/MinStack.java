package com.chidubem.Queues;

public class MinStack {

    class Node{
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    private Node head;

    public void push(int x) {
        if(head == null){
            head = new Node(x,x,null);
        }else{
            head = new Node(x, Math.min(x, head.min), head);
        }
    }

    public void pop(){
        head = head.next;
    }

    public int top(){
        return head.val;
    }

    private int getMin(){
        return head.min;
    }




    /** Java accepted solution using one stack */


}
