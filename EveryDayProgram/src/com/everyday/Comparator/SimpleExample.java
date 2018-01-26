package com.everyday.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SimpleExample {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Students to be enter : ");
        int studStrength = scanner.nextInt();
        for (int i = 0 ; i < studStrength ; i ++){
            System.out.println("Enter the stud roll no : ");
            int rollNo = scanner.nextInt();
            System.out.println("Enter the stud name : ");
            String studName = scanner.next();
            System.out.println("Enter the stud age : ");
            int studAge = scanner.nextInt();
            arrayList.add(new Student(rollNo, studName, studAge));
        }

        System.out.println("Sorting By Student Name");
        System.out.println("+++++++++++++++++++++++");
        Collections.sort(arrayList, new NameComparator());
        for (Student student : arrayList)
            System.out.println(student.rollno + " " + student.name + " " + student.age);

        System.out.println("Sorting By Student Age");
        System.out.println("+++++++++++++++++++++++");
        Collections.sort(arrayList, new AgeComparator());
        for (Student student : arrayList)
            System.out.println(student.rollno + " " + student.name + " " + student.age);
    }
}