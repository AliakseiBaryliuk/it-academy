package by.itacademy.brest.class7.hw.saiko_nikita;

public class LibraryBook extends Library {

    public void checkOutBook(String title) {

        for (Book book : bookList) {
            if (book.title.equals(title)) {
                bookList.remove(book);
                System.out.println("Книга была взята");
            }
            break;
        }
    }
    public void isAvailsble(String title) {

        for (Book book : bookList) {
            if (book.title.equals(title)) {
                System.out.println("Книга есть");
            }
            break;
        }
    }}