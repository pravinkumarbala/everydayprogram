package com.everyday.Logical;

public class MissingNumber {

    public static int maxNumber(int... num){
        int max = num[0];
        for (int j = 0 ; j < num.length ; j++)
            if(max < num[j])
                max = num[j];
        return max;
    }
    public static void main(String[] args) {
        int[] number = new int[]{1,2,3,4,6,7,8};
        int givenArraySum = 0 ;
        int withOutMissingArraySum = 0;
        int missingNumber = 0 ;

        for (int i = 0 ; i < number.length ; i ++)
            givenArraySum += number[i];

        for (int i = 0 ; i <= maxNumber(number); i ++)
            withOutMissingArraySum += i;

        missingNumber = withOutMissingArraySum - givenArraySum;
        System.out.println("Missing number : " + missingNumber);
    }
}