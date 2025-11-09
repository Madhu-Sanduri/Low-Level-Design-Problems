package com.lld.librarymanagment.exception;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String message) {

        super(message);
    }
}
