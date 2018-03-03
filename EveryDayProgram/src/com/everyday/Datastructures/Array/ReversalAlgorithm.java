package com.everyday.Datastructures.Array;

import java.util.Scanner;

public class ReversalAlgorithm {
    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end){
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the Array values : ");
        for (int i = 0 ; i < size; i ++)
            arrVal[i] = scanner.nextInt();
        System.out.println("Enter the rotation range value : ");
        int range = scanner.nextInt();
        leftRotate(arrVal, range);
        System.out.println("After the rotation");
        for (int i = 0 ; i < size ; i ++ )
            System.out.print(arrVal[i] + " ");
    }
}