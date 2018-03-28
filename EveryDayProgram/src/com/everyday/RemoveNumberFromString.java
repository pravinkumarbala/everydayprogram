package com.everyday;

import java.util.Scanner;

public class RemoveNumberFromString {
    public static void main(String[] args) {
        System.out.println("Remove Number from the String");
        System.out.println("-----------------------------");
        System.out.print("Enter the String : ");
        StringBuilder newString = new StringBuilder();
        String inputString = new Scanner(System.in).nextLine();
        for (int i = 0 ; i < inputString.length(); i ++) {
            if (inputString.charAt(i) > 65 && inputString.charAt(i) < 122)
                newString.append(inputString.charAt(i));
        }
        System.out.println("String without number : " + newString.toString());
    }
}