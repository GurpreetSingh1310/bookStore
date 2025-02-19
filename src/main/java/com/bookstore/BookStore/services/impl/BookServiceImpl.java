package com.bookstore.BookStore.services.impl;

import com.bookstore.BookStore.entities.Book;
import com.bookstore.BookStore.repositories.BookRepository;
import com.bookstore.BookStore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Mono<Book> create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Mono<Book> update(Book book, int bookId) {
        Mono<Book> oldBook = bookRepository.findById(bookId);
        oldBook.flatMap(book1 -> {
            book1.setBookName(book.getBookName());
            book1.setAuthor(book.getAuthor());
            book1.setPublisher(book.getPublisher());
            book1.setDescription(book.getDescription());
            return bookRepository.save(book1);


        });
        return oldBook;
    }

    //Change to void if <Book> won't work
    @Override
    public Mono<Book> delete(int bookId) {
        bookRepository.deleteById(bookId);
        return null;
    }

    @Override
    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Book> get(int bookId) {
        return bookRepository.findById(bookId);
    }


    @Override
    public Flux<Book> search(String keyword) {
        return bookRepository.findAll();
//        return null;
    }
}
