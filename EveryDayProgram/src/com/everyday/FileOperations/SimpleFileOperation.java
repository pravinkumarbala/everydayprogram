package com.everyday.FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileOperation {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        File file = new File("Sample.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        System.out.println("Enter the text : ");
        String text = scanner.next();
        bw.write(text);
    }
}