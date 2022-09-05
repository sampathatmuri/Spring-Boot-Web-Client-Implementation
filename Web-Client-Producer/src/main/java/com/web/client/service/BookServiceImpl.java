package com.web.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.client.documents.Book;
import com.web.client.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Optional<Book> getBookById(String id) {
		return bookRepo.findById(id);
	}

	@Override
	public void deleteBookById(String id) {
		bookRepo.deleteById(id);
	}

}
