package by.itacademy.brest.class7.hw.merkulov_oleg.library;

public class LibraryBook {
    private Book book;
    private boolean available;

    public LibraryBook(Book book) {
        this.book = book;
        this.available = true;
    }

    public void checkOutBook() {
        //This method is only responsible for adding tk. you did the validation above in getBook()
        // Just
        // available = false;
        // System.out.println("Книга \"" + book.getTitle() + "\" взята из библиотеки.");
        if (available) {
            available = false;
            System.out.println("Книга \"" + book.getTitle() + "\" взята из библиотеки.");
        } else {
            System.out.println("Книга \"" + book.getTitle() + "\" уже взята из библиотеки.");
        }
    }

    public void returnBook() {
        // The same
        if (!available) {
            available = true;
            System.out.println("Книга \"" + book.getTitle() + "\" возвращена в библиотеку.");
        } else {
            System.out.println("Книга \"" + book.getTitle() + "\" уже находится в библиотеке.");
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

