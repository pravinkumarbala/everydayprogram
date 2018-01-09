package com.everyday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxArrayList {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        ArrayList arrList = new ArrayList();
        System.out.println("Enter the size of the array list ");
        int arrSize = rd.nextInt();
        System.out.println("Enter the arraylist values ");
        for (int i = 0 ; i < arrSize ; i++ )
            arrList.add(rd.nextInt());
        System.out.println("Array list values are " + arrList);

        Object minObject = Collections.min(arrList);
        System.out.println("Minimum value in the array list : " + minObject);

        Object maxObject = Collections.max(arrList);
        System.out.println("Maximum value in the array list : " + maxObject);
    }
}