package OOPS.LibraryPractice;

public class StudentMember extends Member {

    private static int BORROW_LIMIT = 5;

    StudentMember(String name) {
        super(name);
    }

    boolean borrowBook(Book book) {
        return super.borrowBook(book, BORROW_LIMIT);
    }

}
