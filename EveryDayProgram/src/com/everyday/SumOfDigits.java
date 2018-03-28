package com.everyday;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum Of Digits");
        System.out.println("-------------");
        System.out.print("Enter the number : ");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.print("Sum of digits : " + sum);
    }
}