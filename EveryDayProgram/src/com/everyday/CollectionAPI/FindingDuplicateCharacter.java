package com.everyday.CollectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindingDuplicateCharacter {
    public static void checkDuplicateCharacter(String checkString){
        char[] words = checkString.toCharArray();

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : words){
            if (charMap.containsKey(ch))
                charMap.put(ch, charMap.get(ch) + 1);
            else
                charMap.put(ch, 1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.println("List of duplicate words in " + checkString);
        for (Map.Entry<Character, Integer> entry : entrySet)
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings : ");
        int len = scanner.nextInt();

        String[] stringArray = new String[len];
        System.out.println("Enter the string array : ");
        for (int i = 0 ; i < len ; i ++)
            stringArray[i] = scanner.next();

        for (int j = 0 ; j < len ; j ++)
            checkDuplicateCharacter(stringArray[j]);
    }
}