import db.DBBook;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Book book1 = new Book("Lord of The Rings", "Fantasy");
        Book book2 = new Book("1984", "Dystopian");

        DBBook.save(book1);
        DBBook.save(book2);

        List<Book> books = DBBook.getBooks();

        book2.setTitle("1985");

        DBBook.update(book2);

        Book foundBook = DBBook.find(book2.getId());

    }



}
