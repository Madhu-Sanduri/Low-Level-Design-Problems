package com.lld.librarymanagment.service;

import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Borrowing;

import java.util.List;

public interface LibraryService {
    public void issueDate(Integer id,Integer memberId) throws Exception;
    public void renewal(Integer id,Integer memberId);
    public void returned(Integer id,Integer memberId);
    public void listBorrowedBooks();
}
