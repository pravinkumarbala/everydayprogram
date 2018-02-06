package com.everyday.Logical;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovingElements {
    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static ArrayList<Integer> removeDuplicateElement(int[] checkArray){
        for (int j = 0 ; j < checkArray.length ; j ++)
            if (!arrayList.contains(checkArray[j]))
                arrayList.add(checkArray[j]);
        return arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int len = scanner.nextInt();
        int[] integerArray = new int[len];
        System.out.println("Enter the array values : ");
        for (int i = 0 ; i < len ; i ++)
            integerArray[i] = scanner.nextInt();
        System.out.println(removeDuplicateElement(integerArray));
        System.out.println("New Array size : " + arrayList.size());
    }
}