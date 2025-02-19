package com.bookstore.BookStore.services;

import com.bookstore.BookStore.entities.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    public Mono<Book> create(Book book);

    public Mono<Book> update(Book book, int bookId);

    public Mono<Book> delete(int bookId);

    public Flux<Book> findAll();

    public Mono<Book> get(int bookId);

    public Flux<Book> search(String keyword);
}
