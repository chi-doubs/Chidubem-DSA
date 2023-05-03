package com.chidubem.priorityQueue;


import java.security.PublicKey;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerOrder implements Comparable<CustomerOrder> {
    private int orderId;
    private double orderAmount;
    private String customerName;

    public CustomerOrder(int orderId, double orderAmount, String customerName){
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    @Override
    public int compareTo(CustomerOrder o) {
        return o.orderId > this.orderId ? 1 : -1;
    }

    static class CustomerOrderComparator implements Comparator<CustomerOrder> {
        @Override
        public int compare(CustomerOrder o1, CustomerOrder o2) {
            return o1.getOrderAmount() < o2.getOrderAmount() ?  1 : -1;
        }
    }

    @Override
    public String toString(){
        return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName"+ customerName;
    }

    public double getOrderAmount(){
        return orderAmount;
    }

    public static void main(String[] args){
         CustomerOrder c1 = new CustomerOrder(1, 100.0,"customer1");
         CustomerOrder c2 = new CustomerOrder(3, 50.0,"customer3");
         CustomerOrder c3 = new CustomerOrder(2, 300.0,"customer2");

         Queue<CustomerOrder> customerOrders = new PriorityQueue<>(new CustomerOrderComparator());
         customerOrders.add(c1);
         customerOrders.add(c2);
         customerOrders.add(c3);

         while (!customerOrders.isEmpty()){
             System.out.println(customerOrders.poll());
         }

    }
}
