package com.company;

import java.util.Scanner;

public class StackArray {
    int top = -1;
    int max = 100;
    int[] array = new int[max];
    public void push(int number){
        if (top == max-1){
            System.out.println("OverFlow");
        }
        top = top + 1;
        array[top] = number;
    }
    public void pop(){
        if (top == -1){
            System.out.println("UnderFlow");
        }
        top = top - 1;
    }
    public void peek(){
        System.out.println(array[top]);
    }
    public void isEmpty(){
        if (top == -1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Stack isn't Empty");
        }
    }
    public void display(){
        for (int i = 0; i <= top; i++){
            System.out.println(array[i]);
        }
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.isEmpty();
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.display();
        stack.isEmpty();
        stack.pop();
        stack.display();
        stack.peek();
    }
}
