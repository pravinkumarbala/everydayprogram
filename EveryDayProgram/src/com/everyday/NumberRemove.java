package com.everyday;

import java.util.Scanner;

public class NumberRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newWords = "set";
        System.out.println("Enter the string : ");
        String insertString = scanner.next();
        for (int i = 0 ; i < insertString.length() ; i ++){
            char newChar = insertString.charAt(i);
            if (newChar > 65 && newChar < 122)
                newWords += newChar;
            else continue;
        }
        System.out.println(newWords);
    }
}