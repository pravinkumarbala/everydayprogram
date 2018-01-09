package com.everyday;

import java.util.Scanner;

public class LongestCommonSequence {

    public static int commonSeque(char[] str1, char[] str2){
        int m = str1.length;
        int n = str2.length;
        int longSequ[][] = new int[m + 1][n + 1];
        for (int i = 0 ; i <= m ; i++){
            for (int j = 0 ; j <= n ; j++){
                if (i == 0 || j == 0)
                    longSequ[i][j] = 0;
                else if (str1[i - 1] == str2[j - 1])
                    longSequ[i][j] = longSequ[i - 1][j - 1] + 1;
                else
                    longSequ[i][j] = max(longSequ[i - 1][j], longSequ[i][j - 1]);
            }
        }
        return longSequ[m][n];
    }

    public static int max(int a, int b){
        return (a > b)? a : b;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the first word : ");
        String str1 = rd.nextLine();
        System.out.println("Enter the second word : ");
        String str2 = rd.nextLine();
        System.out.println("Common Sequence Word is : " + commonSeque(str1.toCharArray(), str2.toCharArray()));
    }
}