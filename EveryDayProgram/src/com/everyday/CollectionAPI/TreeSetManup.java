package com.everyday.CollectionAPI;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetManup {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int len = scanner.nextInt();
        System.out.println("Enter the names on the hashset");
        System.out.println("Note: Dummy name while elemented");
        for (int i = 0 ; i < len; i ++)
            treeSet.add(scanner.next());

        System.out.println(treeSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        System.out.println("Enter the length : ");
        System.out.println("Enter the names on the hashset");
        System.out.println("Note: Dummy name while elemented");
        for (int i = 0 ; i < len; i ++)
            linkedHashSet.add(scanner.next());

        System.out.println(linkedHashSet);
    }
}
/*
Enter the length :
3
Enter the names on the hashset
Note: Dummy name while elemented
Pravin
Kumar
Pravin
[Kumar, Pravin]
Enter the length :
Enter the names on the hashset
Note: Dummy name while elemented
Pravin
Kumar
Pravin
[Pravin, Kumar]
*/