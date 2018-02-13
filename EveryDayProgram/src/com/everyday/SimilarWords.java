package com.everyday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimilarWords {
    public static void main(String[] args) throws IOException{
        char[] similarWords = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the first string : ");
        System.out.flush();
        String str1 = br.readLine();
        System.out.println("Type the second string : ");
        String str2 = br.readLine();
        int stringLength = str1.length();
        int charNumber = 0, stringCount = 0;
        while(charNumber < stringLength){
            if(str1.charAt(charNumber) == str2.charAt(charNumber)){
                stringCount++;
                System.out.print(str1.charAt(charNumber) + " ");
            }
            charNumber++;
        }
        System.out.println();
        System.out.println("Count : " + stringCount);
    }
}
