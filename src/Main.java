//package com.lld.librarymanagment;

import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Member;
import com.lld.librarymanagment.enums.Roles;
import com.lld.librarymanagment.repo.LibraryRepository;
import com.lld.librarymanagment.service.LibraryService;
import com.lld.librarymanagment.service.LibraryServiceImp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        LibraryRepository libraryRepository = new LibraryRepository();
        LibraryService libraryService = new LibraryServiceImp(libraryRepository);

        // ---------------------------------------------
        // 📘 1. Create sample books and members
        // ---------------------------------------------
        Book book1 = new Book(1, 1897.15, "ISBN-111", "Clean Code", "Robert Martin", LocalDate.of(2019, 1, 1), 10, 1);
        Book book2 = new Book(2, 899.50, "ISBN-112", "Effective Java", "Joshua Bloch", LocalDate.of(2021, 1, 1), 5, 1);
        Book book3 = new Book(3, 599.99, "ISBN-113", "Spring in Action", "Craig Walls", LocalDate.of(2020, 5, 5), 7, 1);

        Member m1 = new Member(1, Roles.MEMBER, "Madhu", LocalDate.now());
        Member m2 = new Member(2, Roles.ADMIN, "Suresh", LocalDate.now());
        Member m3 = new Member(3, Roles.MEMBER, "Ravi", LocalDate.now());

        // add to repo
        libraryRepository.addBook(book1);
        libraryRepository.addBook(book2);
        libraryRepository.addBook(book3);
        libraryRepository.addMember(m1);
        libraryRepository.addMember(m2);
        libraryRepository.addMember(m3);

        // ---------------------------------------------
        // ✅ 2. Basic Issue Tests
        // ---------------------------------------------
        System.out.println("\n=== Test 1: Issue Books ===");
        libraryService.issueDate(1, 1); // Madhu borrows Clean Code
        libraryService.issueDate(2, 1); // Madhu borrows Effective Java
        libraryService.issueDate(3, 2); // Suresh borrows Spring in Action
        libraryService.listBorrowedBooks();

        // ---------------------------------------------
        // 🔁 3. Renewal Test
        // ---------------------------------------------
        System.out.println("\n=== Test 2: Renew Book ===");
        libraryService.renewal(1, 1); // Renew Clean Code for Madhu

        // ---------------------------------------------
        // 📗 4. Return Test
        // ---------------------------------------------
        System.out.println("\n=== Test 3: Return Book ===");
        libraryService.returned(1, 1); // Madhu returns Clean Code
        libraryService.listBorrowedBooks();

        // ---------------------------------------------
        // ❌ 5. Edge Case: Book unavailable
        // ---------------------------------------------
        System.out.println("\n=== Test 4: Book Unavailability ===");
        try {
            // Issue same book again beyond available copies
            libraryService.issueDate(2, 2);
            libraryService.issueDate(2, 3); // should fail if only 1 copy
        } catch (Exception e) {
            System.out.println("❌ Expected Error: " + e.getMessage());
        }

        // ---------------------------------------------
        // 🧾 6. Invalid member/book scenario
        // ---------------------------------------------
        System.out.println("\n=== Test 5: Invalid Entities ===");
        try {
            libraryService.issueDate(999, 1); // invalid book
        } catch (Exception e) {
            System.out.println("❌ Expected Error: " + e.getMessage());
        }

        try {
            libraryService.issueDate(1, 999); // invalid member
        } catch (Exception e) {
            System.out.println("❌ Expected Error: " + e.getMessage());
        }

        // ---------------------------------------------
        // 💰 7. Overdue Fine Test (Simulate late return)
        // ---------------------------------------------
        System.out.println("\n=== Test 6: Overdue Fine Simulation ===");
        // manually set an older issue date to simulate overdue
        libraryRepository.getBorrowingList().forEach(record -> {
            if (record.getMemberId() == 2) { // Suresh's record
                record.setExpectedReturn(LocalDate.now().minusDays(5)); // 5 days late
            }
        });

        try {
            libraryService.returned(3, 2); // should throw fine-related error
        } catch (Exception e) {
            System.out.println("💰 Fine Error: " + e.getMessage());
        }

        // ---------------------------------------------
        // 🔁 8. Re-issue Returned Book Test
        // ---------------------------------------------
        System.out.println("\n=== Test 7: Reissue Book ===");
        libraryService.issueDate(1, 3); // Ravi borrows Clean Code (now available again)
        libraryService.listBorrowedBooks();

        // ---------------------------------------------
        // ✅ 9. Summary
        // ---------------------------------------------
        System.out.println("\n=== Test Completed ===");
        libraryService.listBorrowedBooks();
    }
}
