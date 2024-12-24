package OOPS.LibraryPractice;

public class Book {
    private String title;
    private String author;
    private String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    String getTitle() {
        return title;
    }
}
