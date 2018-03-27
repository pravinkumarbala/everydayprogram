package com.everyday;

import java.util.Scanner;

public class EmailAddressSplit {
    public static void main(String[] args) {
        System.out.println("Splitting the Email address");
        System.out.println("---------------------------");
        System.out.print("Enter the email address : ");
        String email = new Scanner(System.in).nextLine();
        String userName = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("User Name : " + userName);
        System.out.println("Domain : " + domain);
    }
}