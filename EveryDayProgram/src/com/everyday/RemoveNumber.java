package com.everyday;

import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string with number : ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll("[^a-z]", "");
        System.out.println("Entered String with number : " + str);
        System.out.println("Without number : " + newStr);
    }
}