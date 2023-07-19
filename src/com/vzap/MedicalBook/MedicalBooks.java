package com.vzap.MedicalBook;

import com.vzap.author.Author;
import com.vzap.books.Books;

public class MedicalBooks extends Books {
    private String medicalField;

    public MedicalBooks(String title, String ISBN_Number, String bookType, Author author, String medicalField) {
        super(title, ISBN_Number, bookType, author);
        this.medicalField = medicalField;
    }

    public String getMedicalField() {
        return medicalField;
    }

    public void setMedicalField(String medicalField) {
        this.medicalField = medicalField;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + getTitle() + ", ISBN: " + getISBN_Number() + ", Book Type: " + getBookType() + ", Author: " + getAuthor().getSurname() + ", Medical Field: " + medicalField);
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
        return "Medical Book title " + getTitle() + ", ISBN_Number " + getISBN_Number() + ", bookType " + getBookType() + ", author " + getAuthor() + ", medicalField " + medicalField;
    }
}

