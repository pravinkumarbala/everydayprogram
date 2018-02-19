package com.everyday.SimpleProgram;

import java.util.Scanner;

public class MiniDist {
    public static int miniDistance(int arr[], int size){
        int max_element = arr[0];
        int min_distance = size;
        int index = 0;
        int index1 = 0, index2 = 0;
        for (int i = 1 ; i < size ; i ++){
            if (max_element == arr[i]){
                min_distance = Math.min(min_distance, i - index);
                index1 = index;
                index = i ;
                index2 = index;
            } else if (max_element < arr[i]){
                max_element = arr[i];
                min_distance = size;
                index = i ;
            } else continue;
        }

        System.out.println("Maximum value : " + max_element);
        System.out.println("Index postion are " + index1 + " and " + index2);

        return min_distance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the array elements <Integer Values> : ");
        for (int i = 0 ; i < size ; i ++)
            arrVal[i] = scanner.nextInt();
        System.out.println("Minimum Distance : " + miniDistance(arrVal, size));
    }
}