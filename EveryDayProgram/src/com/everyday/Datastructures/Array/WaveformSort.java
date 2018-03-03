package com.everyday.Datastructures.Array;

import java.util.Arrays;
import java.util.Scanner;

public class WaveformSort {

    public void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortInWave(int[] arr){
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length - 1; i += 2)
            swap(arr, i, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaveformSort obj = new WaveformSort();
        System.out.println("Enter the Array Size : ");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the Array values : ");
        for (int i = 0 ; i < size; i ++)
            arrVal[i] = scanner.nextInt();
        obj.sortInWave(arrVal);
        for (int i : arrVal)
            System.out.print(i + ", ");
    }
}