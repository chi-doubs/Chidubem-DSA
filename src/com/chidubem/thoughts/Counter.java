package com.chidubem.thoughts;


public class Counter {
    private int count; // a simple integer instance variable
    public Counter() { } // default constructor (count is 0)
    public Counter(int initial) {
    count = initial;
} // an alternate constructor
 public int getCount() {
    return count;
} // an accessor method
 public void increment() {
    count++;
} // an update method
 public void increment(int delta) {
    count += delta; }
    // an update method
public void reset() { count = 0; }

// public enum Day {MON, TUE, WED, THUR, FRI,SAT, SUN}

    public static class CounterDemo {
 public static void main(String[ ] args) {
     Counter c; // declares a variable; no counter yet constructed
     c = new Counter();// constructs a counter; assigns its reference to c\
//             Counter bro;
//               bro = new Counter();
//               bro.increment(4);
     c.increment(); // increases its value by one
     c.increment(3); // increases its value by three more
     int temp = c.getCount(); // will be 4
     c.reset(); // value becomes 0
     Counter d = new Counter(5);// declares and constructs a counter having value 5
     d.increment(); // value becomes 6
     Counter e = d; // assigns e to reference the same object as d
     temp = e.getCount(); // will be 6 (as e and d reference the same counter)
     e.increment(2); // value of e (also known as d) becomes 8

     System.out.println(temp);
 }

 public static boolean GameEntry(long n , long m) {
     for(int i =0; i <= m; i++){
         if (n == m*i)
             return true;
     }
     return false;
 }






}


}

