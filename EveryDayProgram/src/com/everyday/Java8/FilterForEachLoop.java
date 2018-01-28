package com.everyday.Java8;

import java.util.ArrayList;
import java.util.List;

public class FilterForEachLoop {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("Pravin");
        items.add("Kumar");
        items.add("Setmore");
        items.add("Full Creative");
        items.add("Software Engg");

        items.stream().filter(item -> (item.length() == 4)).forEach(System.out::println);
    }
}