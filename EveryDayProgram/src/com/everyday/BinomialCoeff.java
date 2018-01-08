package com.everyday;

import java.util.Scanner;

public class BinomialCoeff {
    public static int binomialCoef(int n, int k){
        if(k == 0 || k == n){
            return 1;
        } else {
            return binomialCoef(n-1, k-1) + binomialCoef(n-1,k);
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int number, choices;
        System.out.println("Enter the number of participants : ");
        number = rd.nextInt();
        System.out.println("Enter the number of selection choices : ");
        choices = rd.nextInt();
        System.out.println("Binomial Efficiency : " + binomialCoef(number,choices));
    }
}