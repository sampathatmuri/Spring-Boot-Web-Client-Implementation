package com.web.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private String bookId;

	private String bookName;

	private String auotherName;

	private float price;

	private float rating;
}
