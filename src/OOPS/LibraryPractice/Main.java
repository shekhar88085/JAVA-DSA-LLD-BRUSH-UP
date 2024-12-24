package OOPS.LibraryPractice;

public class Main {
    public static void main(String[] args) {
        Library ietLibrary = new Library();
        Book salamChaus = new Book("Salam Chaus", "Salam Chaus", "123$E");
        Book halfGirlFriend = new Book("Half Girlfriend", "Chetan Bhagat", "124$E");
        Book book1 = new Book("book1Title", "book author 1", "133$E");
        Book book2 = new Book("book2Title", "book author 2", "113$E");
        Book book3 = new Book("book3Title", "book author 3", "143$E");
        FacultyMember facultyMember = new FacultyMember("Maheshwari Mam");
        StudentMember studentMember = new StudentMember("Akash Tiwari");
        ietLibrary.addBook(salamChaus);
        ietLibrary.addBook(halfGirlFriend);
        ietLibrary.addBook(book1);
        ietLibrary.addBook(book2);
        ietLibrary.addBook(book3);
        facultyMember.borrowBook(salamChaus);
        facultyMember.borrowBook(halfGirlFriend);
        facultyMember.getBorrowedBooks();
        studentMember.borrowBook(salamChaus);
        studentMember.borrowBook(halfGirlFriend);
        studentMember.borrowBook(book1);
        studentMember.borrowBook(book2);
        studentMember.borrowBook(book3);
        studentMember.getBorrowedBooks();

    }
}
