package com.everyday.advance;

import java.util.LinkedList;
import java.util.Scanner;

public class CompanyDetailsUsingLinkedLIst {

    public static LinkedList<Employee> llst = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static Employee addElement(){
        System.out.println("Enter the employee ID : ");
        int id = scanner.nextInt();
        System.out.println("Enter the employee First Name : ");
        String fn = scanner.next();
        System.out.println("Enter the employee Last Name : ");
        String ln = scanner.next();
        System.out.println("Enter the salary for the employee : ");
        double sal = scanner.nextDouble();
        return new Employee(id, fn, ln, sal);
    }

    public static void insertNewEmployee(){
        llst.add(addElement());
    }

    public static void insertEmployeeAtFirst(){
        llst.addFirst(addElement());
    }

    public static void insertEmployeeAtLast(){
        llst.addLast(addElement());
    }
    public static void displayEmployeeDetails(){
        System.out.println(llst);
    }

    public static void main(String[] args) {

        System.out.println("Enter the employee size : ");
        int empSize = scanner.nextInt();
        for (int i = 0 ; i < empSize ; i ++)
            insertNewEmployee();
        System.out.println("1. AddElementAtFirst \t 2. AddElementAtLast \t 3. DisplayElements \t 4. Exit");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1: System.out.println("Insert the employee at beginning");
                    insertEmployeeAtFirst();break;
                case 2: System.out.println("Insert the employee at end");
                    insertEmployeeAtLast();break;
                case 3: System.out.println("LinkedList Elements are ");
                    displayEmployeeDetails();break;
                case 4: return;
            }
        }
    }
}