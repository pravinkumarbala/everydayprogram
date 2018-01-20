package com.everyday.advance;

import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {
        LinkedHashSet<BookIndex> libraryBookInformation = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of new books to store in DB ");
        int newBookSize = scanner.nextInt();
        System.out.println("Enter the book informations");
        for (int i = 0 ; i < newBookSize ; i ++){
            System.out.println("Enter the Book ID : ");
            int bookID = scanner.nextInt();
            System.out.println("Enter the Book Name : ");
            String bookName = scanner.next();
            System.out.println("Enter the book author name : ");
            String authorName = scanner.next();
            System.out.println("Enter the book published year : ");
            String date = scanner.next();
            libraryBookInformation.add(new BookIndex(bookID, bookName, authorName, new SimpleDateFormat(date)));
        }

        //System.out.println(libraryBookInformation);
        for (BookIndex bi: libraryBookInformation) {
            System.out.println(bi.getBookId() + " " + bi.getBookName() + " " + bi.getAuthorName());
        }

    }
}

/*
* Result
Enter the number of new books to store in DB
2
Enter the book informations
Enter the Book ID :
1
Enter the Book Name :
Java
Enter the book author name :
Pravin
Enter the book published year :
2015
Enter the Book ID :
2
Enter the Book Name :
Javascript
Enter the book author name :
Kumar
Enter the book published year :
2016
1 Java Pravin
2 Javascript Kumar
*/