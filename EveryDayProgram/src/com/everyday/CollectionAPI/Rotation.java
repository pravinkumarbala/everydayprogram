package com.everyday.CollectionAPI;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list :");
        int size = scanner.nextInt();
        System.out.print("Enter the Array List : ");
        for (int i = 0 ; i < size ; i ++)
            myList.add(scanner.next());
        System.out.println("Before Rotation");
        System.out.println(myList);
        System.out.println("After Rotation");
        Collections.rotate(myList,2);
        System.out.println(myList);
    }
}
