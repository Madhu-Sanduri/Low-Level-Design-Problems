package com.lld.librarymanagment.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Borrowing {
    private int borrowId;
    private Book bookId;
    private int memberId;
    private LocalDate issuedDate;
    private LocalDate expectedReturn;
    private boolean isReturned;
    private int renewal;

    public Borrowing() {
    }

    public Borrowing(int borrowId, Book bookId, int memberId, LocalDate issuedDate, LocalDate expectedReturn, boolean isReturned, int renewal) {
        this.borrowId = borrowId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issuedDate = issuedDate;
        this.expectedReturn = expectedReturn;
        this.isReturned = false;
        this.renewal = 0;
    }

    public boolean isOverDue(){
        return !isReturned && expectedReturn.isBefore(LocalDate.now());
    }

    public int calculateFine(){
        if(!isOverDue()) return 0;
        long lateDays= ChronoUnit.DAYS.between(LocalDate.now(),expectedReturn);
        return (int) lateDays*10;
    }

    public void markReturned(){
        this.isReturned=true;
        this.bookId.incrementCopy();
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(LocalDate expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public int getRenewal() {
        return renewal;
    }

    public void setRenewal(int renewal) {
        this.renewal = renewal;
    }

    @Override
    public String toString() {
        return "Borrowing{" +
                "borrowId=" + borrowId +
                ", bookId='" + bookId + '\'' +
                ", memberId=" + memberId +
                ", issuedDate=" + issuedDate +
                ", expectedReturn=" + expectedReturn +
                ", isReturned=" + isReturned +
                ", renewal=" + renewal +
                '}';
    }


}
