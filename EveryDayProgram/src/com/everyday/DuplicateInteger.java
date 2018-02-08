package com.everyday;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInteger {

    public static void result(int... getArrayValues) {
        int arraySize = getArrayValues.length;
        for(int i = 0; i < arraySize; i++) {
            for(int j = i + 1; j < arraySize; j++) {
                if(getArrayValues[i] == getArrayValues[j]) {
                    getArrayValues[j] = getArrayValues[arraySize -1];
                    arraySize--;
                    j--;
                }
            }
        }
        int[] arrayWithoutDuplicates = Arrays.copyOf(getArrayValues, arraySize);
        System.out.println("Array without Duplicates : ");
        for(int arrayValues: arrayWithoutDuplicates) {
            System.out.println(arrayValues);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = read.nextInt();
        int[] sizeOfArray = new int[n];
        System.out.println("Enter the array values :");
        for(int index = 0; index < n; index++) {
            sizeOfArray[index] = read.nextInt();
        }
        result(sizeOfArray);
        read.close();
    }
}

