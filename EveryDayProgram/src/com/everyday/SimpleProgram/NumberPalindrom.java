package com.everyday.SimpleProgram;

import java.util.Scanner;

public class NumberPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int numb = scanner.nextInt();
        int reminder, sum = 0;
        int temp = numb;
        while (numb > 0){
            reminder = numb % 10;
            sum = (sum * 10) + reminder;
            numb /= 10;
        }

        System.out.println(sum);
        if (sum == temp)
            System.out.println("The number is palindrom : " + temp);
        else System.out.println("The number is not palindrom : " + temp);
    }
}