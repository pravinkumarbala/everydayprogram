package com.everyday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WildCard {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the length for the integer list : ");
        int intLen = scanner.nextInt();
        System.out.println("Enter the Integer list");
        for(;i < intLen; i ++)
            list1.add(scanner.nextInt());
        System.out.println("Sum of Integer List : " + sum(list1));

        List<Double> list2 = new LinkedList<>();
        System.out.println("Enter the length for double list : ");
        int doubLen = intLen + scanner.nextInt();
        System.out.println("Enter the Double list");
        for(;i < doubLen ; i ++)
            list2.add(scanner.nextDouble());
        System.out.println("Sum of Double List : " + sum(list2));
    }

    public static Object sum(List<? extends Number> list){
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
/*
Output:
Enter the length for the integer list :
5
Enter the Integer list
5
6
3
2
4
Sum of Integer List : 20.0
Enter the length for double list :
4
Enter the Double list
3.6
3.1
5.2
7.4
Sum of Double List : 19.3
 */