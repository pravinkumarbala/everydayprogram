package com.everyday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailSurename {
    public static void main(String[] args) throws IOException{
         InputStreamReader tInputStreamReader = new InputStreamReader(System.in);
         BufferedReader tKeyboard = new BufferedReader(tInputStreamReader);

         System.out.print("Type in an email address ");

         String tEmail = tKeyboard.readLine();
         int tPositionOfAt = tEmail.indexOf("@");
         int tLastDot = tEmail.lastIndexOf(".",tPositionOfAt);
         String tSurname = tEmail.substring(tLastDot+1,tPositionOfAt);

        System.out.println("The surname is  " + tSurname);
        System.out.println();
    }
}