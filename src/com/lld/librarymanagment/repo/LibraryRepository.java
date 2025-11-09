package com.lld.librarymanagment.repo;

import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Borrowing;
import com.lld.librarymanagment.entity.Member;
import com.lld.librarymanagment.enums.Roles;

import java.time.LocalDate;
import java.util.*;

public class LibraryRepository {
    Book book1=new Book(1,1897.15,"ISBN-111","Clean Code","Robin", LocalDate.of(2019,01,01),10,9);
    Book book2=new Book(2,1897.15,"ISBN-112","Clean Cod 2e","Robin", LocalDate.of(2019,01,01),10,8);

    Member m1 = new Member(1, Roles.MEMBER,"qqwe", LocalDate.now());
    Member m2 = new Member(2, Roles.ADMIN, "eer",LocalDate.now());

    private Map<Integer, Book> books = new HashMap<>(Map.of(1,book1,2,book2)); //Taking as in memory database

    private Map<Integer, Member> memberMap = new HashMap<>(Map.of(1,m1,2,m2)); //Taking as in memory database


    private List<Borrowing> borrowingList = new ArrayList<>(); //Taking as in memory database

    public void addMember(Member member) {
        memberMap.put(member.getMemberId(), member);
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public Optional<Book> findBookById(Integer id) {
        return Optional.ofNullable(books.get(id));
    }

    public Optional<Member> findMemberById(Integer id) {
        return Optional.ofNullable(memberMap.get(id));
    }

    public void addBorrowRecord(Borrowing borrowing) {
        borrowingList.add(borrowing);
    }

    public List<Borrowing> getBorrowingList() {
        return borrowingList;
    }


}
