package com.everyday.CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExampl2 {
    public <T> List<T> intersection(List<T> list1, List<T> list2){
        List<T> list = new ArrayList<T>();

        for (T t: list1) {
            if (list2.contains(t))
                list.add(t);
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(Arrays.asList("Dog", "Cat", "Human"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("Human", "Dog", "Whale", "Rabbit", "Cow"));

        System.out.println(new ArrayListExampl2().intersection(list1, list2));
    }
}