package ua.bulovackiy.service;

import org.springframework.transaction.annotation.Transactional;
import ua.bulovackiy.dao.BookDao;
import ua.bulovackiy.model.Book;

import java.util.List;

/**
 * Created by bulov on 23.04.2017.
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return bookDao.listBooks();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
