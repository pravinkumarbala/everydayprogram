package com.everyday.CollectionAPI;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Shuffling {
    public static void main(String[] args) {
        List myList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list :");
        int size = scanner.nextInt();
        System.out.print("Enter the Array List : ");
        for (int i = 0 ; i < size ; i ++)
            myList.add(scanner.nextInt());
        System.out.println("Before Shuffling");
        System.out.println(myList);
        System.out.println("After Shuffling");
        Collections.shuffle(myList);
        System.out.println(myList);
    }
}