package com.bookstore.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ashwani")
public class BookstoreApplication {

	public static void main(final String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
