package com.everyday.SimpleProgram;

import java.util.*;

public class ShiftNumber {
    public static List<Integer> reverseNumber = new LinkedList<>();

    public static void swapNumber(int number){
        int a = number / 10;
        int b = number % 10;
        int result = b * 10 + a;
        reverseNumber.add(result);
    }

    public static void main(String[] args) {
        System.out.println("Shifting the numbers");
        System.out.println("--------------------");
        System.out.print("Enter the number : ");
        int number = new Scanner(System.in).nextInt();
        while (number > 0){
            int twoNumber = number % 100;
            number /= 100;
            swapNumber(twoNumber);
        }
        Collections.sort(reverseNumber, Collections.reverseOrder());
        System.out.println("Reverse Number : " + reverseNumber);
    }
}