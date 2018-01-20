package com.everyday.advance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookIndex {
    public int bookId;
    public String bookName, authorName;
    public SimpleDateFormat publishDate = new SimpleDateFormat("yyyy");

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public SimpleDateFormat getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(SimpleDateFormat publishDate) {
        this.publishDate = publishDate;
    }

    public BookIndex(int bookId, String bookName, String authorName, SimpleDateFormat publishDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return String.format("Book ID : " + getBookId() +
        "\nBook Name : " + getBookName() +
        "\nAuthor Name : " + getAuthorName() +
        "\nPublished Date : " + getPublishDate());
    }
}