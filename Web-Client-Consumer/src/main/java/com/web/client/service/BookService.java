package com.web.client.service;

import com.web.client.dto.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

	Mono<Book> saveBook(Book book);
	
	Flux<Book> getAllBooks();
	
	Mono<Book> getBookById(String id);
	
	Mono<String> deleteBookById(String id);
}
