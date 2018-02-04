package com.everyday.CollectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SeachingSumFromArray {

    public static ArrayList<Integer> twoSumArrayTarget(final List<Integer> numbers, int tar){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(0);
        arrayList.add(0);
        for (int i = 0 ; i < numbers.size(); i ++){
            if (hashMap.containsKey(numbers.get(i))){
                int index = hashMap.get(numbers.get(i));
                arrayList.set(0, index + 1);
                arrayList.set(1, i +1);
                break;
            }else
                hashMap.put(tar - numbers.get(i), i);
        }

        return arrayList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the array values : ");
        for (int i = 0 ; i < size ; i ++)
            arrayList.add(scanner.nextInt());
        System.out.println("Enter the target to search : ");
        int target = scanner.nextInt();
        ArrayList<Integer> result = twoSumArrayTarget(arrayList, target);

        for (int i: result)
            System.out.println("Index : " + i + " ");
    }
}