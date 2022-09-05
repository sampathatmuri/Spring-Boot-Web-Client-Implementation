package com.web.client.service;
/*
 * This is where we actually invoke
 * other service Controller using Web Client
 * Web Client should be initialized. I initialized
 * it using Constructor injection. As WebClient
 * returns either Mono or Flux I defined return type
 * for these services when output was 0 or 1 = Mono
 * 2 or N = Flux
 */
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.web.client.dto.Book;
import com.web.client.util.ReadingConfigurationProperties;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService {

	// This class is to read application properties
	private ReadingConfigurationProperties prop;

	private WebClient webClient;

	public BookServiceImpl(WebClient.Builder webClient, ReadingConfigurationProperties prop) {
		this.prop = prop;
		this.webClient = webClient.baseUrl(this.prop.getBaseUrl())
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();

	}

	@Override
	public Mono<Book> saveBook(Book book) {
		return webClient.post().uri("/saveBook").body(Mono.just(book), Book.class).retrieve().bodyToMono(Book.class);
	}

	@Override
	public Flux<Book> getAllBooks() {
		return webClient.get().uri("/getAllBooks").retrieve().bodyToFlux(Book.class);
	}

	@Override
	public Mono<Book> getBookById(String id) {
		return webClient.get().uri("/getBookById/"+id).retrieve().bodyToMono(Book.class);
	}

	@Override
	public Mono<String> deleteBookById(String id) {
		return webClient.delete().uri("/deleteBookById/"+id).retrieve().bodyToMono(String.class);
	}

}
