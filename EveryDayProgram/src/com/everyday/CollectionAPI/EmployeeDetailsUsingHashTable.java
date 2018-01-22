package com.everyday.CollectionAPI;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetailsUsingHashTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        System.out.println("Enter the Hash Table length : ");
        int len = scanner.nextInt();
        for (int i = 0 ; i < len ; i ++){
            System.out.println("Enter the Employee ID : ");
            int empID = scanner.nextByte();
            System.out.println("Enter the Employee Name : ");
            String empName = scanner.next();
            hashtable.put(empID, empName);
        }

        for (Map.Entry m : hashtable.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
/*
Output:
Enter the Hash Table length :
2
Enter the Employee ID :
1
Enter the Employee Name :
Pravin
Enter the Employee ID :
2
Enter the Employee Name :
Kumar
2 Kumar
1 Pravin
*/