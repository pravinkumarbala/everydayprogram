package com.everyday.Datastructures.Array;

import java.util.Scanner;

public class SwapAlogrithm {

    public static void leftRotate(int[] arr, int range, int arrSize){
        if (range == 0 || range == arrSize)
            return;
        if (arr.length - range == range){
            swap(arr, 0, arrSize - range, range);
            return;
        }
        if (range < arrSize - range){
            swap(arr, 0, arrSize - range, range);
            leftRotate(arr, range, arrSize - range);
        }else{
            swap(arr, 0, arrSize - range, range);
            leftRotate(arr, 2 * range - arrSize, range);
        }
    }

    public static void swap(int[] arr, int fi, int start, int range){
        int i, temp;
        for (i = 0 ; i < range ; i ++){
            temp = arr [fi + i];
            arr[fi + i] = arr[start + i];
            arr[start + i] = temp;
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
        leftRotate(arrVal, range, size);
        System.out.println("After the rotation");
        for (int i = 0 ; i < size ; i ++ )
            System.out.print(arrVal[i] + " ");
    }
}
