package ua.bulovackiy.dao;

import ua.bulovackiy.model.Book;

import java.util.List;

/**
 * Created by bulov on 23.04.2017.
 */
public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

}
