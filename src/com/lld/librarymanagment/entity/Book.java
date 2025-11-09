package com.lld.librarymanagment.entity;

import java.time.LocalDate;

public class Book {
    private int bookId;
    private double bookPrice;
    private String isbn;
    private String bookName;
    private String author;
    private LocalDate edition;
    private int totalCopies;
    private int currentAvailableCopies;

    public Book() {
    }

    public Book(int bookId, double bookPrice, String isbn, String bookName, String author, LocalDate edition, int totalCopies, int currentAvailableCopies) {
        this.bookId = bookId;
        this.bookPrice = bookPrice;
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.edition = edition;
        this.totalCopies = totalCopies;
        this.currentAvailableCopies = currentAvailableCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getEdition() {
        return edition;
    }

    public void setEdition(LocalDate edition) {
        this.edition = edition;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getCurrentAvailableCopies() {
        return currentAvailableCopies;
    }

    public void setCurrentAvailableCopies(int currentAvailableCopies) {
        this.currentAvailableCopies = currentAvailableCopies;
    }

    public void incrementCopy(){
        currentAvailableCopies++;
    }

    public void decrementCopt(){
        currentAvailableCopies--;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookPrice=" + bookPrice +
                ", isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", edition=" + edition +
                ", totalCopies=" + totalCopies +
                ", currentAvailableCopies=" + currentAvailableCopies +
                '}';
    }
}
