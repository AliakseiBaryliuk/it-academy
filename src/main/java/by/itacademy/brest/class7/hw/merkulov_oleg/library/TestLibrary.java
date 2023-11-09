package by.itacademy.brest.class7.hw.merkulov_oleg.library;

import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Три мушкетёра 1", "Александр Дюма", 1844, "Три мушкетёра ");
        Book book2 = new Book("Три мушкетёра  2", "Александр Дюма", 1845, "Двадцать лет спустя ");
        Book book3 = new Book("Три мушкетёра  3", "Александр Дюма", 1850, "Виконт де Бражелон, или Десять лет спустя ");

        LibraryBook libBook1 = new LibraryBook(book1);
        LibraryBook libBook2 = new LibraryBook(book2);
        LibraryBook libBook3 = new LibraryBook(book3);

        Library library = new Library();
        library.addBook(libBook1);
        library.addBook(libBook2);
        library.addBook(libBook3);

        LibraryBook borrowedBook = library.getBook();
        if (borrowedBook != null) {
            borrowedBook.returnBook();
        }

        library.removeBook(libBook1);

        List<LibraryBook> allBooks = library.getAllBooks();
        for (LibraryBook libraryBook : allBooks) {
            System.out.println("Название: " + libraryBook.getBook().getTitle());
            System.out.println("Доступна ли: " + libraryBook.isAvailable());
        }
    }
}
