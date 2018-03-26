package com.everyday.SimpleProgram;

import java.util.*;

public class ShiftNumber {

    public static void main(String[] args) {
        System.out.println("Shifting the numbers");
        System.out.println("--------------------");
        System.out.print("Enter the number : ");
        int number = new Scanner(System.in).nextInt();
        int pow = 1, result = 0;
        while (number > 0){
            int twoNumber = number % 100;
            number /= 100;
            int a = twoNumber / 10;
            int b = twoNumber % 10;
            int shiftNumber = b * 10 + a;
            result = pow * shiftNumber + result;
            pow *= 100;
        }
        System.out.println("Reverse Number : " + result);
    }
}