package com.chidubem.LinkedLists;


import org.w3c.dom.Node;

// Designing a Linked List Using Doubly Linked List.
public class DoublyLinkedList {
     class Node {
         int val;
         Node prev, next;
         public Node(int val){
             this.val = val;
         }
     }

    private Node head;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
        this.head = null;
    }

    public int get(int index){
        // size is 3 and the index is 4
        if ( index >= size) return -1;
        // {1, 2, 3, 4, 5, 6, 7, 8} Get the 4th index
        //              IX
        int count = 0;
        Node current = head;
        while( count < index){
            current = current.next;
            count++;
        }
        return current.val;
    }

    public void addAtHead(int val){
        // {} ->   {1, 2, 3, 4, 5, 6, 7, 8} Add at the head
      Node node = new Node(val);
      node.next = head;
      node.prev = null;
      head.prev = node;
      head = node;
      size++;
    }

    public void addAtTail(int val) {
        //   {1, 2, 3, 4, 5, 6, 7, 8} <-{} Add at the head
        if (head == null) {
            addAtHead(val);
        } else {
            Node current = head;
            while (current != null) {
                current = current.next;
            }

            Node node = new Node(val);
            current.next = node;
            node.prev = current;
            node.next = null;
            size++;
        }
    }

    public void addAtIndex(int index, int val){
        //   {1, 2, 3, 6, 4, 5, 6, 7, 8} Add at the head

        //       3rd IX, val 4
        if(index > size)return;
        if (index == 0){
            addAtHead(val);
        }else {
            Node current = head;
            int count = 1;
            while(count < index){
                current = current.next;
                count++;
            }
            if( count == size -1){
                Node node = new Node(val);
                Node next = current.next;
                node.prev = current;
                node.next = null;
                size++;
            }else {
                Node node = new Node(val);
                current.next = node;
                node.prev = current;
                node.next = current.next;
                current.prev = node.next;
                size++;
            }
        }
    }

    public void deleteAtIndex(int index){
        //   {1, 2, 3, 4, 5, 6, 7, 8} Add at the head

        if(index > size) return;
        if (index == 0){
            head = head.next;
            size--;
        } else {
            Node current = head;
            int count = 1;
            while (count < index) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
            current.prev = current.prev.prev;
            size--;
        }
    }
}
