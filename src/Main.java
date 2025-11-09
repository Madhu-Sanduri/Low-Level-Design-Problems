import com.lld.librarymanagment.entity.Book;
import com.lld.librarymanagment.entity.Member;
import com.lld.librarymanagment.enums.Roles;
import com.lld.librarymanagment.repo.LibraryRepository;
import com.lld.librarymanagment.service.LibraryService;
import com.lld.librarymanagment.service.LibraryServiceImp;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        LibraryRepository libraryRepository=new LibraryRepository();
        LibraryService libraryService=new LibraryServiceImp(libraryRepository);

        Book book1=new Book(1,1897.15,"ISBN-111","Clean Code","Robin", LocalDate.of(2019,01,01),10,9);
        Book book2=new Book(2,1897.15,"ISBN-112","Clean Cod 2e","Robin", LocalDate.of(2019,01,01),10,8);
        Member m1 = new Member(1, Roles.MEMBER,"qqwe", LocalDate.now());
        Member m2 = new Member(2, Roles.ADMIN, "eer",LocalDate.now());

        libraryRepository.addMember(m2);
        libraryRepository.addMember(m1);

        libraryService.issueDate(1,1);
        libraryService.issueDate(2,1);
        libraryService.listBorrowedBooks();

        libraryService.returned(1,1);

        libraryService.listBorrowedBooks();

    }
}