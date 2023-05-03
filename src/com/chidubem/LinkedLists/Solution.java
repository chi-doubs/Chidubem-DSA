package com.chidubem.LinkedLists;

public class Solution {
    class ListNode {
        int val;
        DoublyLinkedList.Node prev;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode addTwoNumbers(ListNode len1, ListNode len2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy, l1 = len1, l2 = len2;
        int surplus = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = surplus + x + y;
            surplus = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (surplus > 0) current.next = new ListNode(surplus);
   return current.next;
    }
}


//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(0);
//        ListNode head = dummy;
//
//        while( list1 != null || list2 != null){
//            if( list1.val <= list2.val){
//                head.next = list1;
//                list1 = list1.next;
//            }else{
//                head.next = list2;
//                list2 = list2.next;
//            }
//        }
//
//        if(list1 != null) {
//            head.next = list1;
//        } else if( list2 != null){
//            head.next = list2;
//        }
//        return dummy.next;
//    }

//    public static String repeat1(char c, int n){
//        String answer = "";
//        for (int j=0; j<n; j++)
//            answer += c;
//        return answer;
//    }
//
//    // Uses StringBuilder to compose a String with n copies of character c. ∗/
//    public static String repeat2(char c, int n) {
//         StringBuilder sb = new StringBuilder();
//         for (int j=0; j < n; j++)
//             sb.append(c);
//         return sb.toString();
////         }
//        public static void main (String[]args){
//
//        }
//
//
//
//}