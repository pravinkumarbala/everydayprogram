package com.everyday;

import java.util.Scanner;

public class StringSort {

    public static String[] sortedString(String[] sortArray){
        for (int i = 0 ; i < sortArray.length ; i ++){
            for (int j = 1 ; j < (sortArray.length - i) ; j ++){
                if (sortArray[j -1].compareTo(sortArray[j]) > 0){
                    String temp = sortArray[j - 1];
                    sortArray[j - 1] = sortArray[j];
                    sortArray[j] = temp;
                }
            }
        }
        return sortArray;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Sorting the String array without Collection sort method");
        System.out.println("=======================================================");
        System.out.print("Array size : ");
        int size = read.nextInt();
        String[] unsortString = new String[size];
        System.out.print("Enter the array values : ");
        for (int i = 0; i < size ; i ++)
            unsortString[i] = read.next();
        System.out.print("Unsorted String : ");
        for (int i = 0 ; i < size ; i ++){
            System.out.print("\t" + unsortString[i]);
        }
        System.out.print("\n");
        String[] newlySortedArray = sortedString(unsortString);
        System.out.print("Sorted String Array : ");
        for (String newStringArray : newlySortedArray)
            System.out.print(newStringArray + "\t");
    }
}