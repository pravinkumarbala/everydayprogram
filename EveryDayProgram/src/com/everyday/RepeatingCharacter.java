package com.everyday;

import java.util.Scanner;

public class RepeatingCharacter {

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static String repeatChar(String str){
        int strLength = str.length();
        char[] newStr = str.toCharArray();
        int rC[][] = new int[strLength+1][strLength+1];

        /*
        * Making all the index or table value as zero
        */
        for (int i = 0 ; i < strLength ; i ++)
            for (int j = 0 ; j < strLength ; j ++)
                rC[i][j] = 0;

        /*
        * Fill the index or table value based on repeat
        */
        for (int i = 1 ; i < strLength ; i ++){
            for (int j = 1 ; j < strLength ; j ++){
                if(newStr[i - 1] == newStr[j - 1] && i != j)
                    rC[i][j] = 1 + rC[i - 1][j -1];
                else
                    rC[i][j] = max(rC[i][j-1], rC[i-1][j]);
            }
        }

        String res = " ";
        int i = strLength, j = strLength;
        while (i > 0 && j > 0){
            if (rC[i][j] == rC[i-1][j-1] + 1){
                res += newStr[i-1];
                i--;
                j--;
            } else if(rC[i][j] == rC[i-1][j])
                i--;
            else
                j--;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = rd.nextLine();
        System.out.println("Repeating Characters are : " + repeatChar(str));
    }
}