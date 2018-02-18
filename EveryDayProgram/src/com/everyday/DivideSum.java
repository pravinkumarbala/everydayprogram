package com.everyday;

import java.util.Scanner;

public class DivideSum {
    public static int divideAndSum(int[] arrList){
        int sum = 0;
        for (int i = 0 ; i < arrList.length ; i ++)
            if (arrList[i] == 0)
                return -1;
            else if (i == 0)
                sum += arrList[i];
            else sum += arrList[i]/arrList[i -1];
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scanner.nextInt();
        int[] arrList = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0 ; i < n ; i ++)
            arrList[i] = scanner.nextInt();
        System.out.println("Array sum after dividing number from previous " + divideAndSum(arrList));
    }
}