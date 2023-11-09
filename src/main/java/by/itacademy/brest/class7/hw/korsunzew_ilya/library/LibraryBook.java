package by.itacademy.brest.class7.hw.korsunzew_ilya.library;


public class LibraryBook {
    private String Book;

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    private boolean checkedOut;

    public LibraryBook(Book book) {
        checkedOut = false;
    }

    public void checkOutBook() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Книга была взята из библиотеки.");
        } else {
            System.out.println("Книга уже взята из библиотеки.");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Книга была возвращена в библиотеку.");
        } else {
            System.out.println("Книга уже находится в библиотеке.");
        }
    }

    public boolean isAvailable() {
        return !checkedOut;
    }
}

