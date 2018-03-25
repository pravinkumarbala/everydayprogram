package com.everyday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {
    static Map<Character, Integer> countLetter = new HashMap<Character, Integer>();
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Counting the letters in the sentence");
        System.out.println("************************************");
        System.out.print("Enter a sentence : ");
        String sent = read.nextLine();
        char[] letters = sent.toCharArray();
        for (char letter: letters){
            if (Character.isAlphabetic(letter)){
                if (countLetter.containsKey(letter))
                    countLetter.put(letter, countLetter.get(letter) + 1);
                else countLetter.put(letter, 1);
            }
        }
        System.out.println("Letter Count");
        for (Map.Entry<Character, Integer> display : countLetter.entrySet()){
            System.out.println(display.getKey() + "      " + display.getValue());
        }
    }
}
