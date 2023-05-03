package com.chidubem.Queues;

import java.util.Stack;

public class work {

    /**
     * Implement Queue using Stacks
     */
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    int front;

    public void push(int x) {
        if (s1.empty()) {
            front = x;
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
            s2.push(x);
        }
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public void pop() {
        s1.pop();
        if (!s1.empty())
            front = s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    public int peek() {
        return front;

    }

}

class  taste {
    //* APPROACH #2

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    int front;

    public void push(int x) {
        if(s1.empty()){
            front = x;
        }
        s1.push(x);
    }

    public void pop(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }

    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public int peek(){
        if (!s2.empty()){
            s2.peek();
        }
        return front;
    }

}

/**
    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

    public void push(int x) {
        input.push(x);
    }

    public void pop() {
        peek();
        output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
 */