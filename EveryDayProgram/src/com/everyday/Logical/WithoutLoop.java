package com.everyday.Logical;

import java.util.Scanner;

public class WithoutLoop {
    public static void printWithOutLoop(String str, int count){
        System.out.println(count+1 + " : " + str);
        count++;
        if (count < 10)
            printWithOutLoop(str, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to be printed : ");
        String newStr = scanner.next();
        printWithOutLoop(newStr, 0);
    }
}