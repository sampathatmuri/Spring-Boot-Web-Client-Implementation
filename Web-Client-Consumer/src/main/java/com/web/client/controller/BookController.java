package com.web.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.client.dto.Book;
import com.web.client.service.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
		
	@PostMapping("/saveBook")
	public Mono<Book> sendCreateBookEventToService(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping("/getAllBooks")
	public Flux<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBookById/{id}")
	public Mono<Book> getBookById(@PathVariable String id){
		return bookService.getBookById(id);
	}
	
	@DeleteMapping("/deleteBookById/{id}")
	public Mono<String> deleteBookById(@PathVariable String id) {
		return bookService.deleteBookById(id);
	}

}
