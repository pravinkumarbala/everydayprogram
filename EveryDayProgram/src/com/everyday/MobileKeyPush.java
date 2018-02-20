package com.everyday;

import java.util.Scanner;

public class MobileKeyPush {

    public static String[] str = {  "2","22","222", "3","33","333",
                    "4","44","444", "5","55","555", "6","66","666",
                    "7","77","777","7777", "8","88","888", "9","99","999","9999"};

    public static String printSeq(String inputString){
        String output = " ";
        int n = inputString.length();
        for (int i = 0 ; i < n ; i ++){
            if(inputString.charAt(i) == ' ')
                output += "0";
            else {
                int pos = inputString.charAt(i) - 'A';
                output += str[pos];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String input = scanner.nextLine();
        System.out.println("Convent string equiv to mobile number : " + printSeq(input.toUpperCase()));
    }
}