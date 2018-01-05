package com.everyday;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArrayList {

    static ArrayList arrList = new ArrayList();
    static Scanner readInput = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfElements;
        System.out.println("Enter the size of the array list : ");
        numberOfElements = readInput.nextInt();
        System.out.println("Enter the arraylist values :");
        for(int i = 0 ; i < numberOfElements ; i++ ){
            arrList.add(readInput.nextInt());
        }
        System.out.println(arrList);
        /*
        Search operation inside the array list using contain
         */
        System.out.println("Enter the number to be search : ");
        int searchNubmer = readInput.nextInt();
        boolean containStatus = arrList.contains(searchNubmer);
        if (containStatus)
            System.out.println("The number is present in the array list");
        else
            System.out.println("The number is not present in the array list");

        /*
        Find the element in index level for start postion
         */
        System.out.println("Enter the number to search the index position from the head : ");
        int searchIndexNumber = readInput.nextInt();
        int index = arrList.indexOf(searchIndexNumber);
        if (index == -1)
            System.out.println("Array List does not containg" + searchIndexNumber);
        else
            System.out.println("Array list contain the value in index postion : " + index);

        /*
        Find the element in index level from the tail postion
         */
        System.out.println("Enter the number to search the index postion from the tail : ");
        searchIndexNumber = readInput.nextInt();
        index = arrList.lastIndexOf(searchIndexNumber);
        if (index == -1)
            System.out.println("Array List does not containg" + searchIndexNumber);
        else
            System.out.println("Array list contain the value in index postion : " + index);
    }
}