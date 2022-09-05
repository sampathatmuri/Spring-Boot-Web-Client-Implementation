package com.web.client.service;

import java.util.List;
import java.util.Optional;

import com.web.client.documents.Book;

public interface BookService {

	Book saveBook(Book book);

	List<Book> getAllBooks();

	Optional<Book> getBookById(String id);

	void deleteBookById(String id);

}
