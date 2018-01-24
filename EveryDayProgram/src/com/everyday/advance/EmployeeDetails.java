package com.everyday.advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<HashMap<Integer, ArrayList<EmplyoeeName>>> hashSet = new HashSet<HashMap<Integer, ArrayList<EmplyoeeName>>>();
        HashMap<Integer, ArrayList<EmplyoeeName>> empMay = new HashMap<Integer, ArrayList<EmplyoeeName>>();
        ArrayList<EmplyoeeName> arrayList = new ArrayList<>();

        System.out.println("Enter the Employee ID : ");
        int empID = scanner.nextInt();
        System.out.println("Enter the Employee First Name : ");
        String firstname = scanner.next();
        System.out.println("Enter the Employee Lasr Name : ");
        String lastName = scanner.next();
        arrayList.add(new EmplyoeeName(firstname, lastName));
        System.out.println("Array List : " + arrayList);
        empMay.put(empID, arrayList);
        System.out.println("HashMap : " + empMay);
        hashSet.add(empMay);
        System.out.println("HashSet : " + hashSet);
    }
}