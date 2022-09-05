package com.web.client.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.web.client.documents.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
