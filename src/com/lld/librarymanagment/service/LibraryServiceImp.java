package com.lld.librarymanagment.service;

import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Borrowing;
import com.lld.librarymanagment.entity.Member;
import com.lld.librarymanagment.repo.LibraryRepository;

import java.time.LocalDate;
import java.util.List;

public class LibraryServiceImp implements LibraryService{

    private LibraryRepository libraryRepository;

    public LibraryServiceImp(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }



    @Override
    public void issueDate(Integer id, Integer memberId) throws Exception{

        Book book= libraryRepository.findBookById(id)
                                    .orElseThrow(() -> new RuntimeException("Book not found"));

        Member member= libraryRepository.findMemberById(memberId)
                                        .orElseThrow(() ->new RuntimeException("Member not found please ask candidate to register"));

        if(book.getCurrentAvailableCopies()==0){
            throw new Exception("sorry the requested book is not available at this movement");
        }

        book.decrementCopt();
        Borrowing borrowing=new Borrowing(libraryRepository.getBorrowingList().size()+1,
                book,memberId, LocalDate.now(),LocalDate.now().plusDays(20),false,0);
        libraryRepository.addBorrowRecord(borrowing);

        System.out.println("book issued: "+borrowing);

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
