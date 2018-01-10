package com.everyday.advance;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyDetails {
    static Scanner rd = new Scanner(System.in);
    static ArrayList<Employee> companyDetailsArray = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter the employee size : ");
        int empSize = rd.nextInt();
        System.out.println("Enter the employee details");
        for (int i = 0 ; i < empSize ; i ++ ){
            System.out.println("Enter the employee ID : ");
            int id = rd.nextInt();
            System.out.println("Enter the employee First Name : ");
            String fn = rd.next();
            System.out.println("Enter the employee Last Name : ");
            String ln = rd.next();
            System.out.println("Enter the salary for the employee : ");
            double sal = rd.nextDouble();
            companyDetailsArray.add(new Employee(id, fn, ln, sal));
        }

        System.out.println(companyDetailsArray);
    }
}