package com.everyday.advance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ComplexCollectionExample {
    public static void main(String[] args) {
        //HashSet<ArrayList<Employee>> hashSet = new HashSet<ArrayList<Employee>>();
        //ArrayList<Employee> arrayList = new ArrayList<Employee>();
        ArrayList<HashSet<Employee>> arrayList = new ArrayList<HashSet<Employee>>();
        HashSet<Employee> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the employee strength: ");
        int len = scanner.nextInt();
        for (int i = 0 ; i < len ; i ++){
            System.out.println("Enter the employee ID : ");
            int id = scanner.nextInt();
            System.out.println("Enter the employee First Name : ");
            String fn = scanner.next();
            System.out.println("Enter the employee Last Name : ");
            String ln = scanner.next();
            System.out.println("Enter the salary for the employee : ");
            double sal = scanner.nextDouble();
            hashSet.add(new Employee(id, fn, ln, sal));
        }
        arrayList.add(hashSet);

        for (int i = 0 ; i < arrayList.size(); i ++){
            for (Employee emp: arrayList.get(i)) {

            }
        }
    }
}