package com.everyday;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {

    public static void main(String[] args) {
        System.out.println("Checking Email address");
        System.out.println("======================");
        System.out.print("Enter the email address : ");
        String emailAddress = new Scanner(System.in).nextLine();
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        System.out.println(emailAddress + " : " + matcher.matches());

    }
}