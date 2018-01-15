package com.everyday.SortingTechnique;

import java.util.Random;

public class BubbleSort {
    public static int[] sort(int... arrElements){
        for (int i = 0 ; i < arrElements.length ; i ++){
            for (int j = 0 ; j < arrElements.length - 1 ; j ++){
                if (arrElements[j] > arrElements[j + 1]){
                    arrElements[j] = arrElements[j] + arrElements[j+1];
                    arrElements[j+1] = arrElements[j] - arrElements[j+1];
                    arrElements[j] = arrElements[j] - arrElements[j+1];
                }
            }
        }
        return arrElements;
    }

    public static void printArray(int[] sorted_sequence){
        for (int i = 0 ; i < sorted_sequence.length; i ++)
            System.out.print(sorted_sequence[i] + " ");
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        Random random = new Random();
        int N = 10;
        int[] array = new int[N];
        for (int i = 0 ; i < N ; i ++)
            array[i] = Math.abs(random.nextInt(100));
        System.out.println("\nOriginal Array");
        printArray(array);

        System.out.println("\nSorted Array");
        printArray(sort(array));
    }
}