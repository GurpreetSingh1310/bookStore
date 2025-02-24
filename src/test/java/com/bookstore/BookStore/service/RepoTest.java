package com.bookstore.BookStore.service;

import com.bookstore.BookStore.entities.Book;
import com.bookstore.BookStore.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class RepoTest {

    private Object BookRepository;

    @org.junit.Test
    @Test
    public void testing() {
        System.out.println("testing method");
    }

    Mono<Book> nameMono = BookRepository.findByName("Angular front end");
//        StepVerifier.create(nameMono)
//                .expectNextCount(1)
//                .verifyComplete();

//        Flux<Book> authorFlux = bookRepository.findByAuthor("ravi rampal");
//        StepVerifier.create(authorFlux)
//                .expectNextCount(2)
//                .verifyComplete();

        BookRepository.findByNameAndAuthor("Angular front end","rohit")
                .

    as(StepVerifier::create)
                .

    expectNextCount(1)
                .

    verifyComplete();


    @Test
    public void queryMethodsTest() {
    //
    //        bookRepository.getAllBooksByAuthor("Basic Python Book","Python rocker")
    //                .as(StepVerifier::create)
    //                .expectNextCount(1)
    //                .verifyComplete()zzzz;

        BookRepository.searchBookByTitle("%front%")
                .as(StepVerifier::create)
                .expectNextCount(1)
                .verifyComplete();

    }
}


}

