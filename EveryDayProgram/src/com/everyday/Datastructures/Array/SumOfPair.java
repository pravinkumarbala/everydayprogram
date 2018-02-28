package com.everyday.Datastructures.Array;

import java.util.Scanner;

public class SumOfPair {

    public static boolean sumOfPairCheck(int[] arr, int n, int x){
        int i = 0;
        for(; i < n ; i ++)
            if(arr[i] > arr[i+1])
                break;
        //index of minimum value
        int l = ( i + 1 ) % n;
        //index of maximum value
        int r = i;

        while (1 != 0) {
            //check the pair = sum
            if (arr[l] + arr[r] == x )
                return true;

            if (arr[l] + arr[r] < x)
                // move the left index by increasing
                l = ( l + 1 ) % n;
            else
                // move the right index by decreasing
                r = ( n + r - 1) % n;

            System.out.println("The index values are " + l + " and " + r);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the array values : ");
        for (int i = 0 ; i < size ; i ++)
            arrVal[i] = scanner.nextInt();
        System.out.println("Enter the sum for the pairs to be search : ");
        int sum = scanner.nextInt();
        if (sumOfPairCheck(arrVal, size, sum))
            System.out.println("Array has two elements with the sum value " + sum);
        else System.out.println("Array hasn't two elements with the sum value " + sum);
    }
}