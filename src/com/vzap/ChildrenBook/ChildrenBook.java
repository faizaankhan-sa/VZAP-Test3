package com.vzap.ChildrenBook;

import com.vzap.author.Author;
import com.vzap.books.Books;

public class ChildrenBook extends Books {
    private String genre;

    public ChildrenBook(String title, String ISBN_Number, String bookType, Author author, String genre) {
        super(title, ISBN_Number, bookType, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + getTitle() + ", ISBN: " + getISBN_Number() + ", Book Type: " + getBookType() + ", Author: " + getAuthor().getSurname() + ", Genre: " + genre);
    }

    @Override
    public String loanBookInDays(Books book) {
        if (getBookType().equals("reference")) {
            return "reference book cant be let out";
        } else {
            return "book can be let out for 30 days";
        }
    }

    @Override
    public String toString() {
        return "Childrens Book title " + getTitle() + ", ISBN_Number " + getISBN_Number() + ", bookType " + getBookType() + ", author " + getAuthor() + ", genre " + genre;
    }
}


