package com.everyday;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pascal Triangle");
        System.out.println("Enter the number of line to be printed : ");
        int height = scan.nextInt();
        int[] pascalArray = new int[height];
        int[] dummyArray = new int[height];
        pascalArray[0] = 1;
        dummyArray[0] = 1;
        System.out.println(" 1");
        for (int i = 1 ; i < height ; i ++){
            for (int j = 0 ; j < i ; j ++)
                System.out.print(" ");
            for (int k = 1 ; k < height ; k ++)
                pascalArray[k] = dummyArray[k-1] + dummyArray[k];
            pascalArray[i] = 1;
            for (int l = 0 ; l <= i ; l ++) {
                System.out.print(pascalArray[l]);
                dummyArray[l] = pascalArray[l];
            }
            System.out.println();
        }
    }
}