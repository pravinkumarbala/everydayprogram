package com.everyday;

import java.util.Scanner;

public class CharactersInStrings {
    public static void main(String[] args) {
        String txt = " ";
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        txt = scanner.nextLine().toUpperCase();
        System.out.println("Follow Character are used in ");
        for (char ch = 'A' ; ch <= 'Z'; ch ++)
            for (int i = 0 ; i < txt.length() ; i++ )
                if(ch == txt.charAt(i)) {
                    System.out.println(ch + " ");
                    count++;
                    break;
                }
        System.out.println("Total number of different characters are " + count);
    }
}