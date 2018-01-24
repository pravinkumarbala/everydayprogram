package com.everyday;

import java.util.Scanner;

public class PalindromicSubsequence {
    public static int countPS(String str){
        int n = str.length();

        int[][] cps = new int[n + 1][n];
        for (int i = 0 ; i < n ; i ++){
            cps[i][i] = 1;
        }

        for (int j = 2 ; j <= n ; j ++){
            for (int k = 0 ; k < n ; k ++){
                int l = j + k - 1;
                if(l < n){
                    if (str.charAt(k) == str.charAt(l))
                        cps[k][l] = cps[k][l - 1] + cps[k + 1][l];
                    else
                        cps[k][l] = cps[k][l - 1] + cps[k + 1][l] - cps[k + 1][l - 1];
                }
            }
        }
        return cps[0][n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the text : ");
        String st = scanner.next();
        System.out.println("Palindromic Sequence are : " + countPS(st));
    }
}