package com.chidubem.leetcoding;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListCycle {

    public static boolean hasCycle(Node head){
          Node slow = head;
          Node fast = head;

          while(fast != null && fast.next != null){
              slow = slow.next;
              fast = fast.next.next;
              if (slow == fast) return true;
          }
          return false;
    }

    public static void main(String[] args){
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // 3 -> 2 -> 0 -> 4
        System.out.println(head);

        System.out.println("Does the linked list have a cycle? " + hasCycle(head));
    }
}


