package by.itacademy.brest.class7.hw.saiko_nikita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public List<Book> bookList;

    public Library() {
        bookList = new ArrayList();
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название: ");
        String title = sc.next();

        System.out.println("Введите автора: ");
        String author = sc.next();

        System.out.println("Введите год: ");
        int year = sc.nextInt();

        System.out.println("Введите описание книги: ");
        String description = sc.next();

        Book book = new Book(title, author, year, description);
        System.out.println("Книга  добавлена.");
        bookList.add(book);
    }

    public void listBook() {
        System.out.println("Список всех товаров: ");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }

    public void deleteBook(String title) {
        for (Book book : bookList) {
            if (book.title.equals(title)) {
                bookList.remove(book);
            } else System.out.println("Ошибка попробуйте изменить название.");
        }
    }

    public void checkBook(String title) {

        for (Book book : bookList) {
            if (book.title.equals(title)) {
                bookList.remove(book);
                System.out.println("Книга была взята");
            }
            break;
        }
    }

    public void checkAllBook() {

        for (Book book : bookList) {
            bookList.remove(book);
        }
        System.out.println("Книги были взяты");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("1-Добавить книгу.\n2-Взять книгу.\n3-Удалить книгу.\n4-Взять все книги.");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    System.out.println("Введите название: ");
                    String title = sc.next();
                    library.checkBook(title);
                    break;
                case 3:
                    System.out.println("Введите название: ");
                    title = sc.next();
                    library.deleteBook(title);
                    break;
                case 4:
                    library.checkAllBook();
                    break;
            }
        }
    }
}
