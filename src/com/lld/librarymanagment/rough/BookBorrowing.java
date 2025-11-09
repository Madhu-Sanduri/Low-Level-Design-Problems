//package com.lld.librarymanagment;
//
//import java.time.LocalDate;
//
//public class BookBorrowing {
//    private Integer id;
//    private int BookId;
//    private LocalDate issueDate;
//    private LocalDate expectedReturnDate;
//    private boolean returned;
//    private int renewalCount;
//
//    public BookBorrowing() {
//    }
//
//    public BookBorrowing(Integer id, int bookId, LocalDate issueDate, LocalDate expectedReturnDate, boolean returned, int renewalCount) {
//        this.id = id;
//        BookId = bookId;
//        this.issueDate = issueDate;
//        this.expectedReturnDate = expectedReturnDate;
//        this.returned = returned;
//        this.renewalCount = renewalCount;
//    }
//
//    public int getRenewalCount() {
//        return renewalCount;
//    }
//
//    public void setRenewalCount(int renewalCount) {
//        this.renewalCount = renewalCount;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public int getBookId() {
//        return BookId;
//    }
//
//    public void setBookId(int bookId) {
//        BookId = bookId;
//    }
//
//    public LocalDate getIssueDate() {
//        return issueDate;
//    }
//
//    public void setIssueDate(LocalDate issueDate) {
//        this.issueDate = issueDate;
//    }
//
//    public LocalDate getExpectedReturnDate() {
//        return expectedReturnDate;
//    }
//
//    public void setExpectedReturnDate(LocalDate expectedReturnDate) {
//        this.expectedReturnDate = expectedReturnDate;
//    }
//
//    public boolean isReturned() {
//        return returned;
//    }
//
//    public void setReturned(boolean returned) {
//        this.returned = returned;
//    }
//
//    public void bookIssue(int bookId, LocalDate issueDate, LocalDate expectedReturnDate){
//        BookBorrowing bookBorrowing=new BookBorrowing();
//        bookBorrowing.setBookId(bookId);
//        bookBorrowing.setIssueDate(issueDate);
//        bookBorrowing.setExpectedReturnDate(expectedReturnDate);
//        bookBorrowing.setReturned(false);
//
//        //call database to save this data;
//    }
//
//    public LocalDate renewalBook(Integer id) throws Exception {
//        LocalDate expectedReturn= null; //usually we'll database for date;
//        if(expectedReturn.isBefore(LocalDate.now())){
//            return LocalDate.now().plusDays(20); //update same values to database and update renewal count
//        }
//        else{
//            throw new Exception("your time is crossed please pay the fine");
//        }
//    }
//
//    public void bookReturned(int id) throws Exception {
//        LocalDate expectedReturn= null; //usually we'll database for date;
//        if(expectedReturn.isBefore(LocalDate.now())){
//            //update date base values and returned status true
//        }
//        else{
//            throw new Exception("your time is crossed please pay the fine");
//        }
//    }
//
//
//    @Override
//    public String toString() {
//        return "BookBorrowing{" +
//                "id=" + id +
//                ", BookId=" + BookId +
//                ", issueDate=" + issueDate +
//                ", expectedReturnDate=" + expectedReturnDate +
//                ", returned=" + returned +
//                '}';
//    }
//}
