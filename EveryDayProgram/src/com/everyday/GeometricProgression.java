package com.everyday;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting Number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the Common Ratio : ");
        int r = scanner.nextInt();
        System.out.println("Enter the Nth term to be find : ");
        int n = scanner.nextInt();

        System.out.println("The " + n + "th term of the series is " + nThGP(a, r, n));
    }

    public static int nThGP(int a, int r, int n){
        return (a * (int)(Math.pow(r, n - 1)));
    }
}