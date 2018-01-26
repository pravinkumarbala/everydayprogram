package com.everyday;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchingPalindrom {
    public static ArrayList palindromString = new ArrayList();
    public static void palindromCheck(String newString){
        String reverseString = "";
        for (int i = newString.length() - 1; i >= 0 ; i --)
            reverseString += newString.charAt(i);
        if (reverseString.length() != 1)
            if (reverseString.equals(newString))
                palindromString.add(reverseString);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println("Palindrom String");
        System.out.println("****************");
        for (int i = 0 ; i < str.length() ; i ++)
            for( int j = i + 1 ; j < str.length() + 1 ; j ++)
                palindromCheck(str.substring(i,j));
        System.out.println(palindromString);
    }
}