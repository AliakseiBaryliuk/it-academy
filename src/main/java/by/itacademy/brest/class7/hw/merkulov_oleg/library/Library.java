package by.itacademy.brest.class7.hw.merkulov_oleg.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryBook> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(LibraryBook libraryBook) {
        books.add(libraryBook);
        System.out.println("Книга \"" + libraryBook.getBook().getTitle() + "\" добавлена в библиотеку.");
    }

    // you should implement returnBook(String bookName) method as well

    // getBook(String bookName)
    public LibraryBook getBook() {
        for (LibraryBook libraryBook : books) {
            if (libraryBook.isAvailable()) {
                libraryBook.checkOutBook();
                return libraryBook;
            }
        }
        System.out.println("Все книги взяты из библиотеки.");
        return null;
    }

    public List<LibraryBook> getAllBooks() {
        return books;
    }

    public void removeBook(LibraryBook libraryBook) {
        if (books.remove(libraryBook)) {
            System.out.println("Книга \"" + libraryBook.getBook().getTitle() + "\" удалена из библиотеки.");
        } else {
            System.out.println("Книга \"" + libraryBook.getBook().getTitle() + "\" не найдена в библиотеке.");
        }
    }
}
