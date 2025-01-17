package org.example.structural.service;


import org.example.structural.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class LibraryFacade {

    private final BookService bookService;

    @Autowired
    public LibraryFacade(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public List<Book> getFeaturedBooks() {
        return bookService.getFeaturedBooks();
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public void updateBook(Long bookId, Book book) {
        bookService.updateBook(bookId, book);
    }

    public void deleteBook(Long bookId) {
        bookService.deleteBook(bookId);
    }
}