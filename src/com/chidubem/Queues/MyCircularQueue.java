package com.chidubem.Queues;

public class MyCircularQueue {
    /** store elements */
    private int []  data;

    /** specify two pointers: top and end  */
    private int top, end;
    private int size;

    public MyCircularQueue(int k){
        data = new int[k];
        top =0 ;
        end = -1;
        size = k;
    }

    public int Front(){
        if(isEmpty()) return -1;
        return data[top];
    }

    public int Rear(){
        if(isEmpty()) return -1;
         return data[end];
    }

    public boolean enQueue(int val){
      if (isFull()){
          return false;
      }
      if (isEmpty()){
          top = 0;
      }
      end =(end + 1) % size;
      data[end] = val;
      return true;
    }

    public boolean deQueue(){
        if (isEmpty()) return false;
        if (top == end){
            top = 0;
            end = -1;
            return true;
        }
        top = (top +1)% size;
        return true;
    }

   public boolean isEmpty() {
       //Checks whether the circular queue is empty or not.
       return top == -1;
   }

   public boolean isFull(){
       return !isEmpty() && (end + 1) % size == top;
   }

    //    {9,7,5,4,2,6,8}



}
