package com.everyday.Datastructures;

import java.io.IOException;
import java.util.Scanner;

class Stack{
    private int mazSize;
    private int[] data;
    private int top;

    public Stack(int mazSize) {
        this.mazSize = mazSize;
        data = new int[mazSize];
        top = -1;
    }

    public void push(int p){
        data[++top] = p;
    }

    public int pop(){
        return data[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}

public class SummationOfNumbers {
    static int num;
    static int ans;
    static Stack theStack;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Summation Of Number");
        System.out.println("*******************");
        System.out.println("Enter the number for the summation : ");
        num = scanner.nextInt();
        stackAddition();
        System.out.println("Sum : " + ans);
    }

    public static void stackAddition(){
        theStack = new Stack(1000);
        ans = 0;
        while (num > 0) {
            theStack.push(num);
            --num;
        }
        while (!theStack.isEmpty()){
            int newNumber = theStack.pop();
            ans += newNumber;
        }
    }
}
