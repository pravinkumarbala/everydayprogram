package com.everyday.Datastructures.Array;

import java.util.Scanner;

public class PartitionProblem {

    public static boolean findPattern(int[] arr){
        int sum = 0 ;
        int n =arr.length;
        int i = 0 , j = 0;

        for (;i < n; i ++)
            sum += arr[i];

        if (sum % 2 == 0)
            return false;

        //int[][] part = new int[(sum / 2) + 1][n+1];
        boolean[][] part = new boolean[sum / 2 + 1][n+1];
        for (i = 0 ; i <= n ; i ++)
            part[0][i] = true;
        for (i = 1 ; i <= sum/2; i ++){
            for (j = 1; j <= sum/2 ; j++){
                part[i][j] = part[i][j-1] || part[i - arr[j - 1]][j-1];
            }
        }

        return part[sum/2][n];
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
        if (findPattern(arrVal) == true)
            System.out.println("Can be divided into two subset");
        else System.out.println("Can't be divided into two subset");
    }
}