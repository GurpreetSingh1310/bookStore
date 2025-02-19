package com.bookstore.BookStore.controllers;

import com.bookstore.BookStore.entities.Book;
import com.bookstore.BookStore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //Creating Book
    @PostMapping
    public Mono<Book> create(@RequestBody Book book) {
        return Mono.just(book);
    }

    //getAll Books
    @GetMapping
    public Flux<Book> findAll() {
        return bookService.findAll();
    }

    //Get Single Book
    @GetMapping("/{id}")
    public Mono<Book> get(@PathVariable("id") int bookId) {
        return bookService.get(bookId);
    }

    //Updating Book
    @PostMapping("/{id}")
    public Mono<Book> update(@RequestBody Book book, @PathVariable("id") int bookId) {
        return bookService.update(book, bookId);
    }

    //Deleting Book
    @DeleteMapping("/{id}")
    public Mono<Book> delete(@PathVariable("id") int bookId) {
        return bookService.delete(bookId);
    }
}

