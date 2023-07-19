package com.vzap.books;

import com.vzap.author.Author;

public abstract class Books {
    private String title;
    private String ISBN_Number;
    private String bookType;
    private Author author;

    public Books(String title, String ISBN_Number, String bookType, Author author) {
        this.title = title;
        this.ISBN_Number = ISBN_Number;
        this.bookType = bookType;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN_Number() {
        return ISBN_Number;
    }

    public void setISBN_Number(String ISBN_Number) {
        this.ISBN_Number = ISBN_Number;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public abstract void printDetails();

    public abstract String loanBookInDays(Books book);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Books other = (Books) obj;
        return ISBN_Number.equals(other.ISBN_Number) && title.equals(other.title);
    }

    @Override
    public String toString() {
        return "Book title " + title + ", ISBN_Number " + ISBN_Number + ", bookType " + bookType + ", author " + author;
    }
}


