package com.company;

import java.util.Stack;

public class StackInterface {
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int number){
        stack.push(number);
        System.out.print(number + " ");
    }
    public void pop(){
        int temp = stack.peek();
        stack.pop();
    }
    public void isEmpty(){
        System.out.println(stack.isEmpty());
    }
    public void peek(){
        System.out.println(stack.peek());
    }
    public static void main(String[] args) {
        StackInterface s = new StackInterface();
        s.push(10);
        s.push(15);
        s.push(20);
        s.pop();
        s.isEmpty();
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.isEmpty();
    }
}
