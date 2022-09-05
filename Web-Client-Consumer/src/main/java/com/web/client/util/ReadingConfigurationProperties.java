package com.web.client.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("book.client")
@Data
public class ReadingConfigurationProperties {
	
	private String baseUrl;

}
