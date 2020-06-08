package com.company;


public class StackLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node top = null;
    public void push(int number){
        Node newNode = new Node(number);
        if (top == null){
            newNode.next = null;
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }
    public void pop(){
        if (top == null){
            System.out.println("UnderFlow");
        }
        else {
            top = top.next;
        }
    }
    public void peek(){
        if (top == null){
            System.out.println("Empty");
        }
        else {
            System.out.println(top.data);
        }
    }
    public void isEmpty(){
        if (top == null){
            System.out.println("Empty");
        }
        else {
            System.out.println("Not Empty");
        }
    }
    public void display(){
        Node display = top;
        while (display != null){
            System.out.println(display.data);
            display = display.next;
        }
    }
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.isEmpty();
        s.push(10);
        s.push(20);
        s.push(15);
        s.display();
        s.isEmpty();
        s.peek();
        s.pop();
        s.display();
        s.peek();
    }
}
