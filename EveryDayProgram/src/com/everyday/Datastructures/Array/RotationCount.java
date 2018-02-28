package com.everyday.Datastructures.Array;

import java.util.Scanner;

public class RotationCount {

    public static int countRotation(int[] arr){
        int min = arr[0], min_index = -1;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the array values : ");
        for (int i = 0 ; i < size ; i ++)
            arrVal[i] = scanner.nextInt();
        System.out.println("Number of rotation : " + countRotation(arrVal));
    }
}