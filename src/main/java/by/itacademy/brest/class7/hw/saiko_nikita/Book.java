package by.itacademy.brest.class7.hw.saiko_nikita;

public class Book {
String title;
String author;
int year;
String description;

    public Book(String title, String author, int year, String description) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
    }
    public void getDetailse(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
        System.out.println(description);
    }
}
