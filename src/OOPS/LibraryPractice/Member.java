package OOPS.LibraryPractice;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    Member(String name) {
        this.name = name;
    }

    boolean borrowBook(Book book, int limit) {
        if (borrowedBooks.size() < limit) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed book " + book.getTitle());
            return true;
        } else {
            System.out.println(name + " cannot borrow book " + book + " as he already exshausted his limit");
            return false;
        }
    }

    void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}
