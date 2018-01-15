package com.everyday;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListManup {
    public static LinkedList llst = new LinkedList();

    public static void addElementAtFirst(int num){
        llst.addFirst(num);
    }

    public static void addElementAtLast(int num){
        llst.addLast(num);
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size of the Linked List : ");
        int llSize = rd.nextInt();
        for (int i = 0 ; i < llSize; i ++)
            llst.add(Math.abs(random.nextInt(100)));
        System.out.println("1. AddElementAtFirst\t 2. AddElementAtLast\t 3. DisplayElement\t 4. Exit");
        while (true){
            System.out.println("Enter the choice : ");
            int choices = rd.nextInt();
            switch (choices) {
                case 1:
                    System.out.println("Enter the integer to be add at first : ");
                    addElementAtFirst(rd.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the integer to be add at end : ");
                    addElementAtLast(rd.nextInt());
                    break;
                case 3:
                    System.out.println("Linked List values are ");
                    System.out.println(llst);
                    break;
                default:
                    System.out.println("Exits");
                    return;
            }
        }
    }
}