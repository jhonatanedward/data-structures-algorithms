package datastructures.Stack;

import java.util.LinkedList;

public class Stack {
    public Node top;
    public int heigth;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        this.top = new Node(value);
        heigth = 1;
    }

    public void printTop(){
        System.out.println("Top: " + top.value);
    }

    public void printHeigth() {
        System.out.println("Height: " + heigth);
    }

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(heigth == 0) {
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        heigth++;
    }

    public Node pop() {
        if(heigth == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        return temp;
    }
}
