package com.everyday.SimpleProgram;

import java.util.Scanner;

public class MaximumSegmentValue {
    public static int findMaxSeg(String inputNumber, int seg){
        int segLen = inputNumber.length() - seg;
        int res = 0 ;

        for (int i = 0 ; i < segLen ; i ++)
            res = res * 10 + ( inputNumber.charAt(i) - '0' );

        int segLengthPower = (int) Math.pow(10, segLen - 1);
        int currentValue = res;

        for (int i = 1 ; i <= (inputNumber.length() - segLen ) ; i++){
            currentValue = currentValue - (inputNumber.charAt(i - 1) - '0') * segLengthPower;
            currentValue = currentValue * 10 - (inputNumber.charAt(i - 1) - '0');
            res = Math.max(res, currentValue);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number [without space] : ");
        String inputNumber = scanner.nextLine();
        System.out.println("Enter the Segment Range of Value");
        int seg = scanner.nextInt();
        System.out.println("Maximum Segment Value : " + findMaxSeg(inputNumber, seg));
    }
}