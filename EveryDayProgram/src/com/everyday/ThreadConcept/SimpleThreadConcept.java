package com.everyday.ThreadConcept;

import java.util.Scanner;

class Calculator extends Thread{
    Scanner read = new Scanner(System.in);
    @Override
    public void run() {
        int choice = 0;
        do {
            System.out.println("1. Add 2. Sub 3. Mul 4. Div 5. Exit");
            choice = read.nextInt();
            System.out.print("First Number : ");
            int firstNumber = read.nextInt();
            System.out.print("Second Number : ");
            int secondNumber = read.nextInt();
            switch (choice){
                case 1: int sum = add(firstNumber, secondNumber);
                        System.out.println("Sum of two numbers : " + sum);
                        break;
                case 2: int diff = sub(firstNumber, secondNumber);
                        System.out.println("Difference of two numbers : " + diff);
                        break;
                case 3: int mult = mul(firstNumber, secondNumber);
                        System.out.println("Multiplication of two numbers : " + mult);
                        break;
                case 4: int dive = div(firstNumber, secondNumber);
                        System.out.println("Division of two numbers : " + dive);
                        break;
                case 5: System.out.println("Exit for the system");
                        break;
                default: System.out.println("Sorry, You have selected wrong option");
                        break;
            }

        }while (choice != 5);
    }

    public synchronized int add(int x, int y){
        return x + y;
    }

    public synchronized int sub(int x, int y){
        return x - y;
    }

    public synchronized int mul(int x, int y){
        return x * y;
    }

    public synchronized int div(int x, int y){
        int diff = 0;
        try{
            diff = x / y;
        }catch (ArithmeticException e){
            y = 1;
            System.out.println(e.getMessage());
            diff = x / y;
        }

        return diff;
    }

}

public class SimpleThreadConcept {

    public static void main(String[] args) {
        System.out.println("Calculate");
        System.out.println("#########");
        Calculator cal = new Calculator();
        cal.start();
    }
}