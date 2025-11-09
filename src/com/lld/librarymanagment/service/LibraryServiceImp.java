package com.lld.librarymanagment.service;

import com.lld.librarymanagment.entity.Book;

import java.util.List;

public class LibraryServiceImp implements LibraryService{

    @Override
    public void issueDate(Integer id, Integer memberId) {

    }

    @Override
    public void renewal(Integer id, Integer memberId) {

    }

    @Override
    public void returned(Integer id, Integer memberId) {

    }

    @Override
    public List<Book> listBorrowedBooks() {
        return List.of();
    }
}
