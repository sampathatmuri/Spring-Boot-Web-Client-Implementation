package com.web.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.web.client.repository")
public class WebClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientProducerApplication.class, args);
	}

}
