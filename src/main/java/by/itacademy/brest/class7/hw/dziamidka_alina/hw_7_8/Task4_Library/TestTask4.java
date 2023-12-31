package by.itacademy.brest.class7.hw.dziamidka_alina.hw_7_8.Task4_Library;

public class TestTask4 {
    public static void main(String[] args) {

        Library library = new Library(new LibraryBook[5]);

        Book book1 = new Book("The Trial", "Franz Kafka", "1925", "Absurdity of the judicial system");
        Book book2 = new Book("The Gambler", "Fyodor Dostoevsky", "1866", "Human weakness");

        library.addBook(book1);
        library.addBook(book2);

//        library.checkOutAllBooks();

//        library.checkOut(book1);
//        library.checkOut(book2);

        library.deleteBook(book1);

        library.checkOut(book1);
        library.checkOut(book2);
    }
}
