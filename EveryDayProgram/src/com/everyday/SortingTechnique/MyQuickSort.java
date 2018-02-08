package com.everyday.SortingTechnique;

import java.util.Scanner;

public class MyQuickSort {

    private static int array[] = new int[20];

    public static void quickSort(int lowerBound, int higherBound) {
        int i = lowerBound;
        int j = higherBound;
        // Calculating pivot as middle value
        int pivot = array[lowerBound + (higherBound - lowerBound) / 2];
        // Divide into two arrays
        while (i < j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if(lowerBound < j)
            quickSort(lowerBound, j);
        if (higherBound > i)
            quickSort(i, higherBound);
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array : ");
        n = inputReader.nextInt();
        System.out.println("Enter the array values : ");
        for(int i = 1 ; i <= n ; i++) {
            System.out.print("a[" + (i-1) + "] = ");
            array[i] = inputReader.nextInt();
        }

        if(array == null || array.length == 0) {
            System.out.println("Sorry, unable to perform sorting operation because no values have been insert");
        } else {
            System.out.println("The Quicksort operations is started");
            quickSort(0, array.length - 1);
            System.out.println("Operation Over");
        }
        inputReader.close();
    }
}