package com.everyday.SimpleProgram.ThreadDemos;

import java.util.Scanner;

public class DivisbleByEight {
    public static boolean divByEight(int number){
        return (((number >> 3) << 3)== number);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int numb = scanner.nextInt();
        if (divByEight(numb))
            System.out.println(numb + " Is Divisble by 8 ");
        else System.out.println(numb + " Is Not Divisble by 8 ");
    }
}