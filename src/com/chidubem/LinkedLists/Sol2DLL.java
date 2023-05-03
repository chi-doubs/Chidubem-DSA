package com.chidubem.LinkedLists;

public class Sol2DLL {

    class DLLNode {

        DLLNode prev;
        DLLNode next;
        int val;

        public DLLNode(int val) {
            this.val = val;
        }
    }

    class MyLinkedList {

        DLLNode head;
        DLLNode tail;
        int size;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            this.head = new DLLNode(0);
            this.tail = new DLLNode(0);

            head.next = tail;
            tail.prev = head;

            this.size = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if(index<0 || index >=size) {
                return -1;
            }

            DLLNode node = getNodeAtIndex(index);
            return node.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {

            DLLNode next = head.next;

            DLLNode newNode = new DLLNode(val);
            newNode.next = next;
            newNode.prev = head;

            head.next = newNode;
            next.prev = newNode;

            size++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            DLLNode prev = tail.prev;

            DLLNode newNode = new DLLNode(val);
            newNode.prev = prev;
            newNode.next = tail;

            prev.next = newNode;
            tail.prev = newNode;

            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {

            if(index<0 || index > size) {
                return;
            }

            if(index == size) {
                addAtTail(val);
                return;
            }

            DLLNode curr = getNodeAtIndex(index);

            DLLNode prev = curr.prev;

            DLLNode newNode = new DLLNode(val);
            newNode.next = curr;
            newNode.prev = prev;

            prev.next = newNode;
            curr.prev = newNode;

            size++;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if(index<0 || index >= size) {
                return;
            }

            DLLNode curr = getNodeAtIndex(index);
            DLLNode prev = curr.prev;
            DLLNode next = curr.next;

            prev.next = next;
            next.prev = prev;

            size--;
        }

        public DLLNode getNodeAtIndex(int index) {

            DLLNode curr;

            if(index < size/2) {
                curr = head.next;
                int currIndex = 0;
                while(currIndex!=index) {
                    curr = curr.next;
                    currIndex++;
                }
            } else {
                curr = tail.prev;
                int currIndex = size - 1;
                while(currIndex!=index) {
                    curr = curr.prev;
                    currIndex--;
                }
            }

            return curr;
        }
    }
}

