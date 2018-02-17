package com.everyday.SimpleProgram;

public class LinkedListImplementation {

    static Node head;

    static class Node{
        int data;
        Node next;
        /* Constructor */
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImplementation.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;

        printList();
    }

}
