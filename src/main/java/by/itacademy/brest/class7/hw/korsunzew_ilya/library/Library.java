package by.itacademy.brest.class7.hw.korsunzew_ilya.library;

import java.util.Objects;

public class Library {
    private LibraryBook[] books = new LibraryBook[100];

    public Library(LibraryBook[] books) {
        this.books = books;
    }

    public void addBooks(LibraryBook[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        LibraryBook libraryBook = new LibraryBook(book);
        for (int i = 0; i < books.length; i++) {
            if (Objects.isNull(books[i])) ;
            books[i] = libraryBook;
            System.out.println(" ");
            return;

        }
    }

    public void checkOut(Book book) {
        for (int i = 0; i < books.length; i++) {
            LibraryBook libraryBook = books[i];
            if (Objects.nonNull(libraryBook) && libraryBook.getBook().equals(book) && libraryBook.isAvailable()) {
                libraryBook.checkOutBook();
                System.out.println(" ");
                return;
            }
        }
    }

    public void deleteBook(Book book) {
//        for (int i = 0; i < books.length; i++) {
//            if (Objects.nonNull(books[i].getBook().equals(book) && books[i])) {
//                books[i] = null;
//                System.out.println(" ");
//            }
//        }
    }
}