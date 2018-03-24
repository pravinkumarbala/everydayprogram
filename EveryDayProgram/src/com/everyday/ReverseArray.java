package com.everyday;

import java.util.Scanner;

public class ReverseArray {

    public static String reverseWord(String word){
        char[] letters = word.toCharArray();
        int len = word.length();
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0 ; i --)
            sb.append(letters[i]);
        return sb.toString();
    }

    public static String[] reverseArray(String[] array){
        int len = array.length;
        String[] newRevArr = new String[len];
        for (int i = len - 1, j = 0; i >= 0 ; i --, j ++ )
            newRevArr[j] = reverseWord(array[i]);
        return newRevArr;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Reserve the string array and word");
        System.out.println("=================================");
        System.out.print("Array size : ");
        int size = read.nextInt();
        String[] arrayWords = new String[size];
        System.out.print("Enter the array values : ");
        for (int i = 0; i < size ; i ++)
            arrayWords[i] = read.next();
        String revArr[] = reverseArray(arrayWords);
        System.out.print("After Reversing the array and word : ");
        for (String reverse : revArr)
            System.out.print("\t" +reverse);
    }
}