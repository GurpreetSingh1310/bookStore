package com.bookstore.BookStore.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("book_details")
public class Book {


    @Id
    private int bookId;


    private String bookName;

    @Column("book_dsc")
    private String description;

    private String publisher;

    private String author;

    //Declaring Constructor
    public Book(int bookId, String bookName, String description, String publisher, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.description = description;
        this.publisher = publisher;
        this.author = author;
    }

    //No arg constructor
    public Book() {
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
