package com.web.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.client.documents.Book;
import com.web.client.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/getBookById/{id}")
	public Optional<Book> getBookById(@PathVariable String id) {
		return bookService.getBookById(id);
	}
	
	@DeleteMapping("/deleteBookById/{id}")
	public void deleteBookById(@PathVariable String id) {
		bookService.deleteBookById(id);
	}
}
