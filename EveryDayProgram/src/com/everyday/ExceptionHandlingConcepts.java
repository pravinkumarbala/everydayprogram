package com.everyday;

import java.util.Scanner;

public class ExceptionHandlingConcepts {

    public static void arthimeticOperation(int a, int b){
        try{
            int result = a/b;
            System.out.println("Result is " + result);

        } catch (ArithmeticException e){
            System.out.println("Exception "+ e.getMessage());
            b = 1;
            int  result = a / b ;
            System.out.println("Result is " + result);
        }
    }
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        int a = rd.nextInt();
        int b = rd.nextInt();
        arthimeticOperation(a, b);
    }
}