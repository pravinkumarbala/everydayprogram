package com.everyday.Logical;

public class MovingZerosToEnd {
    public static void main(String[] args) {
        int[] arrayNumber = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int i = 0;
        System.out.println("Original Array");
        for (int n : arrayNumber)
            System.out.print(n + ", ");
        for (int j = 0; j < arrayNumber.length ; ){
            if (arrayNumber[j] == 0)
                j++;
            else{
                int temp = arrayNumber[i];
                arrayNumber[i] = arrayNumber[j];
                arrayNumber[j] = temp;
                i++;
                j++;
            }
        }
        while (i < arrayNumber.length)
            arrayNumber[i++] = 0;
        System.out.println("\n");
        System.out.println("After moving 0's to the end of the array ");
        for (int n : arrayNumber)
            System.out.print(n + ", ");
    }
}