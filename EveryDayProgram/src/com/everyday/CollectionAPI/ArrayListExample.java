package com.everyday.CollectionAPI;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
        ArrayList<String> stringArrayList1 = new ArrayList<>();

        stringArrayList1.add("Pravin");
        stringArrayList1.add("Kumar");

        System.out.println("First Arraylist String element are :" + stringArrayList1);
        ArrayList<String> stringArrayList2 = new ArrayList<>();

        stringArrayList2.add("Full");
        stringArrayList2.add("Creative");

        System.out.println("Second Arraylist String element are : " + stringArrayList2);
        arrayList.add(stringArrayList1);
        arrayList.add(stringArrayList2);

        System.out.println("Array List Elements are");
        for (int i = 0 ; i < arrayList.size() ; i ++)
            //for (int j = 0 ; j < arrayList.get(i).size() ; j ++)
            for (Object obj:
                 arrayList.get(i))
                System.out.println(obj);//System.out.println(arrayList.get(i).get(j));

    }
}