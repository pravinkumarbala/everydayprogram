package com.everyday.Logical;

public class FindingSeries {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 1, 2};
        int len = nums.length;

        int search = 53;
        System.out.println("Give search sequence : " + search);
        System.out.println("Combination of Four Elements");
        for (int i = 0 ; i < len ; i ++)
            for (int j = i + 1; j < len - 2 ; j ++)
                for (int k = j + 1; k < len - 1 ; k ++)
                    for (int l = k + 1 ; l < len ; l ++ )
                        if (nums[i] + nums[j] + nums[k] + nums[l] == search)
                            System.out.println(nums[i] + " "  + nums[j] + " "  + nums[k] + " " + nums[l]);
    }
}