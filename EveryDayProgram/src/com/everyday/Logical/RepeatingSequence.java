package com.everyday.Logical;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatingSequence {
    public static void checkingString(String repeatString){
        char[] charString = repeatString.toCharArray();
        int i = 0;
        for ( i = 0 ; i < repeatString.length() ; i++) {
            int count = 0;
            char word = 0;
            for (int j = i; j < repeatString.length() ; j++) {
                if (charString[i] == charString[j]) {
                    word = charString[i];
                    count++;
                }
                else {
                    i = j;
                    break;
                }
            }
            System.out.println(word + " : " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String getString = scanner.next();
        checkingString(getString);
    }
}