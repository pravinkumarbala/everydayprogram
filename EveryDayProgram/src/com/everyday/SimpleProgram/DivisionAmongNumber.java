package com.everyday.SimpleProgram;

import java.util.Scanner;

public class DivisionAmongNumber {
    public static int findNumber(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            int j = 0;
            for ( ; j < arr.length ; j ++)
                if (arr[j] % arr[i] >= 1)
                    break;
            if (j == arr.length)
                return arr[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the array elements <Integer Values> : ");
        for (int i = 0 ; i < size ; i ++)
            arrVal[i] = scanner.nextInt();
        System.out.println("Number disible among the array : " + findNumber(arrVal));
    }
}