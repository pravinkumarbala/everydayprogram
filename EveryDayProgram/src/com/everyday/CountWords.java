package com.everyday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Map<String, Integer> wordsCount = new LinkedHashMap<String, Integer>();
        System.out.println("Counting the words in the sentence");
        System.out.println("==================================");
        System.out.print("Enter the sentences : ");
        String sentence = new Scanner(System.in).nextLine();
        String[] words = sentence.split(" ");
        for (String word : words){
            if (wordsCount.containsKey(word)){
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        System.out.println("Words  Count");
        for (Map.Entry<String, Integer> display : wordsCount.entrySet())
            System.out.println(display.getKey() + "  " + display.getValue());
    }
}
