package com.everyday;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayElement {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();

        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        /*arrayList1.add("4");
        arrayList1.add("5");
        arrayList1.add("6");
        arrayList1.add("7");*/

        ArrayList arrayList2 = new ArrayList();

        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");
        arrayList2.add("Four");
        arrayList2.add("Five");

        System.out.println("Before copying, Second array list contains : " + arrayList2);

        Collections.copy(arrayList2, arrayList1);
        System.out.println("After Copying, Second array list contains : " + arrayList2);
    }
}