package com.lld.librarymanagment.repo;

import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Borrowing;
import com.lld.librarymanagment.entity.Member;

import java.util.*;

public class LibraryRepository {
    private Map<Integer, Book> books=new HashMap<>(); //Taking as in memory database
    private Map<Integer, Member> memberMap=new HashMap<>(); //Taking as in memory database
    private List<Borrowing> borrowingList=new ArrayList<>(); //Taking as in memory database

    public void addMember(Member member){
        memberMap.put(member.getMemberId(),member);
    }

    public void addBook(Book book){
        books.put()
    }
}
