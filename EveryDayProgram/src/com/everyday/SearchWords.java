package com.everyday;

import java.util.Scanner;

public class SearchWords {
    static String[] words = {"cat", "dog"};
    static String randomWords;

    public static void dictionay(String getString, String[] strings) {
        boolean found;
        for (String str : strings) {
            found = getString.contains(str);
            System.out.println(found);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the ramdom letters without space : ");
        randomWords = reader.nextLine();
        System.out.println("After searching the word in the letters");
        dictionay(randomWords, words);
        reader.close();
    }
}
