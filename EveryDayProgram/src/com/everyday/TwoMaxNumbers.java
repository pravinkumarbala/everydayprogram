package com.everyday;

import java.util.Scanner;

public class TwoMaxNumbers {
    public static void findTwoMaxNumber(int... numbers) {
        int maxOne = 0, maxTwo = 0;
        for(int num: numbers) {
            if(maxOne < num) {
                maxTwo = maxOne;
                maxOne = num;
            } else if (maxTwo < num) {
                maxTwo = num;
            }
        }
        System.out.println("First Max Number : " + maxOne);
        System.out.println("Second Max Number : " + maxTwo);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number[];
        int sizeOfArray;
        System.out.println("Enter the size of the array : ");
        sizeOfArray = read.nextInt();
        number = new int[sizeOfArray];
        for(int index = 0; index < number.length; index++) {
            number[index] = read.nextInt();
        }
        findTwoMaxNumber(number);
        read.close();
    }
}
