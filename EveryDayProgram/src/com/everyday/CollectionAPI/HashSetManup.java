package com.everyday.CollectionAPI;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetManup {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int len = scan.nextInt();
        System.out.println("Enter the names on the hashset");
        System.out.println("Note: Dummy name while elemented");
        for (int i = 0 ; i < len; i ++)
            hashSet.add(scan.next());
        System.out.println(hashSet);
    }
}