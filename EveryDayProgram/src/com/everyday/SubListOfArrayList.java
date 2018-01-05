package com.everyday;

import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class SubListOfArrayList {

    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();

        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add("4");
        arrList.add("5");

        List list = arrList.subList(1,3);

        System.out.println("Sub List contains : ");
        for (int i = 0 ; i < list.size() ; i++ )
            System.out.println(list.get(i));

        Object obj = list.remove(0);

        System.out.println(obj + " is removed from the sub list");

        System.out.println("After removing " + obj + " from the sub list");
        for (int i = 0 ; i < arrList.size() ; i++ )
            System.out.println(arrList.get(i));
    }
}