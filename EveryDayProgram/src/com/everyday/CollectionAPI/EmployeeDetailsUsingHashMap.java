package com.everyday.CollectionAPI;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDetailsUsingHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employee : ");
        int empLen = scanner.nextInt();
        for (int i = 0 ; i < empLen ; i ++){
            System.out.println("Enter the employee ID : ");
            int empID = scanner.nextInt();
            System.out.println("Enter the employee Name : ");
            String empName = scanner.next();
            hashMap.put(empID, empName);
        }
        System.out.println("Employee Details");
        for (int i = 1 ; i <= hashMap.size(); i ++){
            System.out.println("Emp Name : " + hashMap.get(i));
        }
        System.out.println(hashMap);
    }
}

/*
Enter the number of employee :
3
Enter the employee ID :
1
Enter the employee Name :
Pravin
Enter the employee ID :
2
Enter the employee Name :
Kumar
Enter the employee ID :
3
Enter the employee Name :
Pravinkumar
Employee Details
Emp Name : Pravin
Emp Name : Kumar
Emp Name : Pravinkumar
{1=Pravin, 2=Kumar, 3=Pravinkumar}
 */