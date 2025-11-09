//package com.lld.librarymanagment;
//
//public class BookManagement {
//
//    private Integer bookId;
//    private String bookName;
//    private String ISBNCode;
//    private double bookPrice;
//    private int currentQuantity;
//    private String bookAuthor;
//
//    public BookManagement() {
//    }
//
//    public BookManagement(Integer bookId, String bookName, String ISBNCode, double bookPrice, int currentQuantity, String bookAuthor) {
//        this.bookId = bookId;
//        this.bookName = bookName;
//        this.ISBNCode = ISBNCode;
//        this.bookPrice = bookPrice;
//        this.currentQuantity = currentQuantity;
//        this.bookAuthor = bookAuthor;
//    }
//
//    public Integer getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Integer bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public String getISBNCode() {
//        return ISBNCode;
//    }
//
//    public void setISBNCode(String ISBNCode) {
//        this.ISBNCode = ISBNCode;
//    }
//
//    public double getBookPrice() {
//        return bookPrice;
//    }
//
//    public void setBookPrice(double bookPrice) {
//        this.bookPrice = bookPrice;
//    }
//
//    public int getCurrentQuantity() {
//        return currentQuantity;
//    }
//
//    public void setCurrentQuantity(int currentQuantity) {
//        this.currentQuantity = currentQuantity;
//    }
//
//    public String getBookAuthor() {
//        return bookAuthor;
//    }
//
//    public void setBookAuthor(String bookAuthor) {
//        this.bookAuthor = bookAuthor;
//    }
//
//
//
//    public void addBook(String bookName){
//        //add Book to database and relavent logic;
//    }
//    public void updateBook(String bookName){
//        //update book logic
//    }
//
//    public boolean findBook(String bookName){
//        //database call to find the bookQauntity is greater than zero
//        //if find we need return List<Book>
//        return false;
//    }
//
//
//    public void deleteBook(String bookName){
//        //database to remove the book data
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "BookManagement{" +
//                "bookId=" + bookId +
//                ", bookName='" + bookName + '\'' +
//                ", ISBNCode='" + ISBNCode + '\'' +
//                ", bookPrice=" + bookPrice +
//                ", currentQuantity=" + currentQuantity +
//                ", bookAuthor='" + bookAuthor + '\'' +
//                '}';
//    }
//}
