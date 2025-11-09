package com.lld.librarymanagment.service;

import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Borrowing;
import com.lld.librarymanagment.entity.Member;
import com.lld.librarymanagment.repo.LibraryRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

        libraryRepository.getBorrowingList().stream()
                .filter( record -> record.getBookId().equals(id)
                        && record.getMemberId()==memberId
                        && !record.isOverDue())
                .findFirst()

                .ifPresent(r->{
                    r.getBookId().decrementCopt();
                    r.calculateFine();
                    System.out.println("Book renewed");
                });

    }

    @Override
    public void returned(Integer id, Integer memberId) {

        Optional<Borrowing> borrowingStream = libraryRepository.getBorrowingList().stream()
                                        .filter(r -> r.getBookId().equals(id) && r.getMemberId() == id)
                                        .findFirst();

        if(borrowingStream.get().getIssuedDate().isBefore(LocalDate.now())){
            borrowingStream.get().setReturned(true);
        }
        else{
            int fine=borrowingStream.get().calculateFine();
            System.out.println("please pay over due fine: "+fine);
        }


    }

    @Override
    public void listBorrowedBooks() {
        libraryRepository.getBorrowingList()
                .forEach(System.out::println);
    }
}
