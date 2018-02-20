package com.everyday.SimpleProgram;

import java.util.Scanner;

public class AverageTwoNumber {

    public static int floorAvg(int x, int y){
        return (x + y) >> 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int x = scanner.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int y = scanner.nextInt();
        System.out.println("Average of numbers without division : " + floorAvg(x, y));
    }
}