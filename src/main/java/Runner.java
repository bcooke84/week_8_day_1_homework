import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Book book1 = new Book("Lord of The Rings", "Fantasy");
        Book book2 = new Book("1984", "Dystopian");

        Author author1 = new Author("JRR", "Tolkein");
        Author author2 = new Author("George", "Orwell");

        DBBook.save(book1);
        DBBook.save(book2);

        DBAuthor.save(author1);
        DBAuthor.save(author2);

        List<Book> books = DBBook.getBooks();
        List<Author> authors = DBAuthor.getAuthors();

        book2.setTitle("1985");
        author2.setFirstName("Barry");

        DBBook.update(book2);
        DBAuthor.update(author2);

        Book foundBook = DBBook.find(book2.getId());
        Author foundAuthor = DBAuthor.find(author2.getId());

    }



}
