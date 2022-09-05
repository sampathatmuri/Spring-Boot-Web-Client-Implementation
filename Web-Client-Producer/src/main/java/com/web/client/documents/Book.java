package com.web.client.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Books")
public class Book {

	@Id
	private String bookId;

	private String bookName;

	private String auotherName;
	
	private float price;

	private float rating;
}
