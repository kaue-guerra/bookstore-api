package com.guerra.bookstore;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.domain.Category;
import com.guerra.bookstore.repositories.BookRepostory;
import com.guerra.bookstore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication{

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}
