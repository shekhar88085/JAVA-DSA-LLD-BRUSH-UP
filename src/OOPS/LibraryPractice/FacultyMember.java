package OOPS.LibraryPractice;

public class FacultyMember extends Member {
    private static int BORROW_LIMIT = 10;

    FacultyMember(String name) {
        super(name);
    }

    boolean borrowBook(Book book) {
        return super.borrowBook(book, BORROW_LIMIT);
    }
}
