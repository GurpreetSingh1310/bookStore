package com.bookstore.BookStore.repositories;

import com.bookstore.BookStore.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Integer> {

    public Mono<Book> findByBookName(String bookName);

    public Flux<Book> findByAuthor(String author);

    public Flux<Book> findByPublisher(String publisher);

    public Flux<Book> findByBookNameAndAuthor(String name, String author);

}
